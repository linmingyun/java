package gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class MyMouseAdapter {

  public static void main(String args[]) {
    new MyFrame("drawing...");
  }
}

@SuppressWarnings("unchecked")
class MyFrame extends Frame {

  private static final long serialVersionUID = 1L;
  ArrayList points = null;

  MyFrame(String s) {
    super(s);
    points = new ArrayList();
    setLayout(null);
    setBounds(300, 300, 400, 300);
    this.setBackground(new Color(204, 204, 255));
    setVisible(true);
    this.addMouseListener(new Monitor2());
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

class Monitor2 extends MouseAdapter {

  public void mousePressed(MouseEvent e) {
    MyFrame f = (MyFrame) e.getSource();
    f.addPoint(new Point(e.getX(), e.getY()));
    f.repaint();
  }
}
