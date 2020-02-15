package socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceiveDemo {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(12345);//������վ
            byte[] buf = new byte[1024];
            DatagramPacket packet=new DatagramPacket(buf, buf.length);//��������
            socket.receive(packet);//��ʼ��������

            //��ȡ�Է���������Ϣ
            InetAddress address = packet.getAddress();
            System.out.println(address.getHostAddress());
            //��ȡ��������
            byte[] data = packet.getData();
            System.out.println("��������:"+new String(data,0,packet.getLength()));
            //��ȡ���ݳ���
            int length = packet.getLength();
            System.out.println("���ݳ���:"+length);

            //��ȡ���ն˿ں�
            int port = packet.getPort();
            System.out.println("���ն˿ں���:"+port);

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            socket.close();
        }
    }
}