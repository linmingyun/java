package pattern03.abstractfactory;

import pattern02.factorymethod.common.MailSender;
import pattern02.factorymethod.common.Sender;

public class SendMailFactory implements Provider {
    public Sender produce(){
        return new MailSender();
    }
}