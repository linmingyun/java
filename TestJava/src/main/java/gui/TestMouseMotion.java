package gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseMotion {

  public static void main(String args[]) {
    new MyFrame88("drawing...");
  }
}

@SuppressWarnings("unchecked")
class MyFrame88 extends Frame {

  private static final long serialVersionUID = 1L;
  ArrayList points = null;

  MyFrame88(String s) {
    super(s);
    points = new ArrayList();
    setLayout(null);
    setBounds(300, 300, 400, 300);
    this.setBackground(new Color(204, 204, 255));
    setVisible(true);
    this.addMouseMotionListener(new Monitor5());
  }

  public void paint(Graphics g) {
    Iterator i = points.iterator();
    while (i.hasNext()) {
      Point p = (Point) i.next();
      g.setColor(Color.BLUE);
      g.fillOval(p.x, p.y, 10, 10);
    }
  }

  public void addPoint(Point p) {
    points.add(p);
  }
}

class Monitor5 extends MouseMotionAdapter {

  private int num = 0;

  public void mouseMoved(MouseEvent e) {
    MyFrame88 f = (MyFrame88) e.getSource();
    f.addPoint(new Point(e.getX(), e.getY()));
    if (num++ >= 5) {
      f.repaint();
      num = 0;
    }
  }
}
