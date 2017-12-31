package gui;

import java.awt.*;

public class TestMultiFrame {

  public static void main(String args[]) {
    new MyFrame4(100, 100, 200, 200, Color.BLUE);
    new MyFrame4(300, 100, 200, 200, Color.YELLOW);
    new MyFrame4(100, 300, 200, 200, Color.GREEN);
    new MyFrame4(300, 300, 200, 200, Color.MAGENTA);
  }
}

class MyFrame4 extends Frame {

  private static final long serialVersionUID = 1L;
  static int id = 0;

  MyFrame4(int x, int y, int w, int h, Color color) {
    super("MyFrame4 " + (++id));
    setBackground(color);
    setLayout(null);
    setBounds(x, y, w, h);
    setVisible(true);
  }
}
