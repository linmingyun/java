package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFActionEvent {

  public static void main(String[] args) {
    new TFFrame();
  }

}

class TFFrame extends Frame {

  private static final long serialVersionUID = 1L;

  TFFrame() {
    TextField tf = new TextField();
    add(tf);
    tf.addActionListener(new TFActionListener());
    pack();
    setVisible(true);
  }
}

class TFActionListener implements ActionListener {

  public void actionPerformed(ActionEvent e) {
    TextField tf = (TextField) e.getSource();
    System.out.println(tf.getText());
    //tf.setText("");
  }
}
