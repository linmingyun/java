package pattern02.factorymethod.staticmethod;

import pattern02.factorymethod.common.MailSender;
import pattern02.factorymethod.common.Sender;
import pattern02.factorymethod.common.SmsSender;

/**
 * ������˵������ģʽ�ʺϣ����ǳ����˴����Ĳ�Ʒ��Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ��
 * ����ͨ����������ģʽ���д����������ϵ�����ģʽ�У���һ�����������ַ�������
 * ������ȷ�������󣬵���������ڵڶ��֣�����Ҫʵ���������࣬���ԣ����������£�
 * ���ǻ�ѡ�õ����֡�����̬��������ģʽ��
 */
public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}