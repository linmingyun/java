package pattern03.abstractfactory;

import pattern02.factorymethod.common.Sender;

/**
 * ��������ģʽ��һ��������ǣ���Ĵ������������࣬Ҳ����˵�������Ҫ��չ����
 * ����Թ���������޸ģ���Υ���˱հ�ԭ�����ԣ�����ƽǶȿ��ǣ���һ�������⣬��ν����
 * ���õ����󹤳�ģʽ��������������࣬����һ����Ҫ�����µĹ��ܣ�
 * ֱ�������µĹ�����Ϳ����ˣ�����Ҫ�޸�֮ǰ�Ĵ��롣
 * ��ʵ���ģʽ�ĺô����ǣ����������������һ�����ܣ�����ʱ��Ϣ����ֻ����һ��ʵ���࣬
 * ʵ��Sender�ӿڣ�ͬʱ��һ�������࣬ʵ��Provider�ӿڣ���OK�ˣ�����ȥ�Ķ��ֳɵĴ��롣
 * ����������չ�ԽϺã�
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}