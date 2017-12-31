package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowClose {

  public static void main(String args[]) {
    new MyFrame55("MyFrame");
  }
}

class MyFrame55 extends Frame {

  private static final long serialVersionUID = 1L;

  MyFrame55(String s) {
    super(s);
    setLayout(null);
    setBounds(300, 300, 400, 300);
    this.setBackground(new Color(204, 204, 255));
    setVisible(true);
    //this.addWindowListener(new MyWindowMonitor());

    this.addWindowListener(new WindowAdapter() {

      public void windowClosing(WindowEvent e) {
        setVisible(false);
        System.exit(-1);
      }
    });

  }
  /*
   * class MyWindowMonitor extends WindowAdapter {
   * public void windowClosing(WindowEvent e) {
   * setVisible(false);
   * System.exit(0);
   * }
   * }
   */
}
