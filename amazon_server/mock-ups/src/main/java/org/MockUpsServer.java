package org.mockups;

import java.net.ServerSocket;
import java.net.Socket;

import org.proto.AmazonUpsProto.*;   // ← 你的 .proto 生成的类全在这里
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Message;

/**
 * 极简 Mock-UPS：<br>
 *   1. 收到 ABookTruck → 回 ACK (AUCommunication) <br>
 *   2. 紧接着推送 UTruckArrived (UACommunication)
 */
public class MockUpsServer {

    /* ---------- 带 VarInt32 长度前缀的工具 ---------- */
    private static <T extends Message> void writeDelimited(
            CodedOutputStream out, T msg) throws Exception {
        out.writeUInt32NoTag(msg.getSerializedSize());
        msg.writeTo(out);
        out.flush();
    }
    private static <T extends Message> T readDelimited(
            CodedInputStream in,
            com.google.protobuf.Parser<T> parser) throws Exception {
        int size = in.readUInt32();                 // 读长度
        int old  = in.pushLimit(size);              // 只解析 size 字节
        T msg    = parser.parseFrom(in);
        in.popLimit(old);
        return msg;
    }

    public static void main(String[] args) throws Exception {

        int port = 22222;
        try (ServerSocket ss = new ServerSocket(port)) {
            System.out.println("[MockUPS] listening on " + port);

            try (Socket sock = ss.accept()) {
                var cin  = CodedInputStream.newInstance(sock.getInputStream());
                var cout = CodedOutputStream.newInstance(sock.getOutputStream());

                /* ---- 1) 先接 AInformWorld，回 UReceivedWorld ---- */
                AInformWorld ainf = readDelimited(cin, AInformWorld.parser());
                long worldId = ainf.getWorldid();
                UReceivedWorld urec = UReceivedWorld.newBuilder()
                                                    .setWorldid(worldId).build();
                writeDelimited(cout, urec);
                System.out.println("[MockUPS] handshake ok, worldId=" + worldId);

                /* ---- 2) 循环处理 AUCommunication ---- */
                while (true) {
                    AUCommunication au = readDelimited(cin, AUCommunication.parser());

                    if (au.getBookingsCount() > 0) {
                        ABookTruck b = au.getBookings(0);
                        long seq = b.getSeqnum();          // Amazon 的 seqnum

                        /* 2-a 回 ACK (AUCommunication) */
                        AUCommunication ack =
                            AUCommunication.newBuilder().setAcks(seq).build();
                        writeDelimited(cout, ack);

                        /* 2-b 推送 UTruckArrived (UACommunication) */
                        UTruckArrived arrived = UTruckArrived.newBuilder()
                                .setPackageid(b.getPackageid())
                                .setTruckid(77)
                                .setSeqnum(seq + 1000)      // 随便给个 seq
                                .build();
                        UACommunication push =
                            UACommunication.newBuilder().addArrived(arrived).build();
                        writeDelimited(cout, push);

                        System.out.printf(
                            "[MockUPS] booked pkg=%d → truck 77 arrived%n",
                            b.getPackageid());

                    } else if (au.hasAcks()) {
                        System.out.println("[MockUPS] recv Amazon-Ack = " + au.getAcks());
                    } else if (au.getDeliversCount() > 0) {
                        System.out.println("[MockUPS] recv StartDeliver");
                    }
                }
            }
        }
    }
}
