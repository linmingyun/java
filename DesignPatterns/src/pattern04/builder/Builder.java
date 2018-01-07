package pattern04.builder;

import pattern02.factorymethod.common.MailSender;
import pattern02.factorymethod.common.Sender;
import pattern02.factorymethod.common.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й���
 * �����������϶�����ν���϶������ָĳ������в�ͬ�����ԣ�
 * ��ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ��ġ�
 * ����㿴����������ģʽ���ܶ๦�ܼ��ɵ�һ������������Դ�����Ƚϸ��ӵĶ�����
 * �����빤��ģʽ��������ǣ�����ģʽ��ע���Ǵ���������Ʒ����������ģʽ���ע�������϶��󣬶�����֡�
 * ��ˣ���ѡ�񹤳�ģʽ���ǽ�����ģʽ����ʵ�����������
 */
public class Builder {

    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
        }
    }
}