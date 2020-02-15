package socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class UDPSendDemo {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            //������վ
            socket = new DatagramSocket();
            byte[] buf = "hello,UDP".getBytes();
            InetAddress address = InetAddress.getByName("localhost");
            //�����ֿ�
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address,12345);
            //��������
            socket.send(packet);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //�رջ�վ
            socket.close();
        }
    }
}