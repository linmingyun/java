package pattern02.factorymethod.common;

public class SmsSender implements Sender {
    public void Send() {
        System.out.println("this is sms sender!");
    }
}