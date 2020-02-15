package pattern02.factorymethod.common;

public class MailSender implements Sender {
    public void Send() {
        System.out.println("this is mailsender!");
    }
}