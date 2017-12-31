package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFMathTest2 extends Frame {

  private static final long serialVersionUID = 1L;
  TextField                 num1;
  TextField                 num2;
  TextField                 sum;

  public static void main(String[] args) {
    new TFMathTest2().launchFrame();
  }

  public void launchFrame() {
    num1 = new TextField();
    num2 = new TextField();
    sum = new TextField();
    num1.setColumns(10);
    num2.setColumns(10);
    sum.setColumns(15);
    setLayout(new FlowLayout());
    //setSize(500, 30);
    Label lblPlus = new Label("+");
    Button btnEqual = new Button("=");
    btnEqual.addActionListener(new MyListener2(this));
    add(num1);
    add(lblPlus);
    add(num2);
    add(btnEqual);
    add(sum);
    pack();
    setVisible(true);
  }
}

class MyListener2 implements ActionListener {

  //private TFMathTest2 tfmt;

  private TextField num1, num2, sum;

  public MyListener2(TFMathTest2 tfmt) {
    //this.tfmt = tfmt;
    /*
     * this.num1 = tfmt.num1;
     * this.num2 = tfmt.num2;
     * this.sum = tfmt.sum;
     */
    this(tfmt.num1, tfmt.num2, tfmt.sum);
  }

  public MyListener2(TextField num1, TextField num2, TextField sum) {
    this.num1 = num1;
    this.num2 = num2;
    this.sum = sum;
  }

  public void actionPerformed(ActionEvent e) {
    String s1 = num1.getText();
    String s2 = num2.getText();
    int i1 = Integer.parseInt(s1);
    int i2 = Integer.parseInt(s2);
    sum.setText(String.valueOf(i1 + i2));
  }
}
