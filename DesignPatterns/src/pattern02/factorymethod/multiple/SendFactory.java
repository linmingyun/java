package pattern02.factorymethod.multiple;

import pattern02.factorymethod.common.MailSender;
import pattern02.factorymethod.common.Sender;
import pattern02.factorymethod.common.SmsSender;

/**
 * �����������ģʽ���Ƕ���ͨ��������ģʽ�ĸĽ�������ͨ��������ģʽ�У�������ݵ��ַ�������
 * ������ȷ�������󣬶������������ģʽ���ṩ��������������ֱ𴴽�����
 */
public class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}