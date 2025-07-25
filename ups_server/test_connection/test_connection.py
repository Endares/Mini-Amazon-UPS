import socket
import world_ups_1_pb2
from google.protobuf.internal.encoder import _EncodeVarint
from google.protobuf.internal.decoder import _DecodeVarint32

def send_protobuf_msg(sock, msg):
    data = msg.SerializeToString()
    _EncodeVarint(sock.send, len(data), None)
    sock.send(data)

def recv_protobuf_msg(sock, msg_type):
    varint_buf = []
    while True:
        byte = sock.recv(1)
        if not byte:
            raise EOFError("Socket closed while reading message length")
        varint_buf.append(byte)
        try:
            msg_len, new_pos = _DecodeVarint32(b''.join(varint_buf), 0)
            if new_pos != 0:
                break
        except IndexError:
            continue

    msg_data = b''
    while len(msg_data) < msg_len:
        chunk = sock.recv(msg_len - len(msg_data))
        if not chunk:
            raise EOFError("Socket closed while reading message body")
        msg_data += chunk

    msg = msg_type()
    msg.ParseFromString(msg_data)
    return msg

# =================== 主函数 ===================

msg = world_ups_1_pb2.UConnect()
msg.isAmazon = False
truck = msg.trucks.add()
truck.id = 1
truck.x = 100
truck.y = 200

with socket.create_connection(("127.0.0.1", 12345)) as sock:
    send_protobuf_msg(sock, msg)
    print("✅ UConnect sent")

    response = recv_protobuf_msg(sock, world_ups_1_pb2.UConnected)
    print("✅ Received UConnected:")
    print(response)