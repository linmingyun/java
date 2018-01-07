package pattern02.factorymethod.multiple;

import pattern02.factorymethod.common.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}