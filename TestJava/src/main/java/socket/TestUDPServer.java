package socket;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestUDPServer {

  public static void main(String args[]) throws Exception {
    byte buf[] = new byte[1024];
    DatagramPacket dp = new DatagramPacket(buf, buf.length);
    DatagramSocket ds = new DatagramSocket(5678);
    while (true) {
      ds.receive(dp);
      ByteArrayInputStream bais = new ByteArrayInputStream(buf);
      DataInputStream dis = new DataInputStream(bais);
      System.out.println(dis.readLong());
    }
  }
}