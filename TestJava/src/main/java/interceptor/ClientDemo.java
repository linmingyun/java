package interceptor;

public class ClientDemo {
    public static void main(String args[]) {
        // ������̬��������
        DynamicProxyHandler handler = new DynamicProxyHandler();

        // ����ҵ���������
        BusinessFacade business = new BusinessClass();

        // ����ҵ��������󣬲��ö�̬����󶨴�����
        BusinessFacade businessProxy = (BusinessFacade) handler.bind(business);

        // ����ҵ������еķ�������ʾ������Ч��
        businessProxy.doSomething();
    }
}