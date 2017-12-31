package gui;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKey {

  public static void main(String[] args) {
    new KeyFrame().launchFrame();
  }
}

class KeyFrame extends Frame {

  private static final long serialVersionUID = 1L;

  public void launchFrame() {
    setSize(200, 200);
    setLocation(300, 300);
    addKeyListener(new MyKeyMonitor());
    setVisible(true);
  }

  class MyKeyMonitor extends KeyAdapter {

    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      if (keyCode == KeyEvent.VK_UP) {
        System.out.println("UP");
      }
    }
  }
}
