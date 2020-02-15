package pattern03.abstractfactory;

import pattern02.factorymethod.common.Sender;
import pattern02.factorymethod.common.SmsSender;

public class SendSmsFactory implements Provider{
    public Sender produce() {
        return new SmsSender();
    }
}