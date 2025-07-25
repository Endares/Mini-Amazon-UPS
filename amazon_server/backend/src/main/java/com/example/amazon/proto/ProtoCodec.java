package com.example.amazon.proto;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Component;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;

@Component
public class ProtoCodec {
    /**
     * Send a length‑prefixed protobuf message:
     * writeDelimitedTo 已经把 varint32 + payload 写好
     */
    public <T extends MessageLite> void send(OutputStream out, T msg) throws IOException {
        // print send
        System.out.println("send: " + msg);
        // 1) 取 payload
        byte[] payload = msg.toByteArray();
        // 2) 先写 varint32 长度前缀
        CodedOutputStream cos = CodedOutputStream.newInstance(out);
        cos.writeUInt32NoTag(payload.length);
        cos.flush();              // 推到下层缓冲
        // 3) 再写真正消息体
        out.write(payload);
        out.flush();              // ☆ 只 flush 一次，确保出去
        
    }

    /**
     * Receive a length‑prefixed protobuf message robustly:
     * 1) 先用 CodedInputStream 读 varint32 长度
     * 2) 再在原始 InputStream 上循环读满 length 字节
     * 3) 最后用 parser.parseFrom() 构造消息对象
     */
    public <T extends MessageLite> T receive(InputStream in, Parser<T> parser) throws IOException {
        CodedInputStream cis = CodedInputStream.newInstance(in);
        int len = cis.readRawVarint32();      // 会 honor socket SO_TIMEOUT
        byte[] bytes = cis.readRawBytes(len);
        
        // 4) 用 parser 解析
        T msg = parser.parseFrom(bytes);
        // print receive
        System.out.println("receive: " + msg);
        
        // 5) 返回
        return msg;
    }
}