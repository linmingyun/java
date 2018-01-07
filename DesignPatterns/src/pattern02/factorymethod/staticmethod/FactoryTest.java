package pattern02.factorymethod.staticmethod;

import pattern02.factorymethod.common.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.Send();
    }
}