package interceptor;

/**
 * ������
 */
public class InterceptorClass {
    // �� action ֮ǰ����
    public void before(){
        System.out.println("�������� InterceptorClass �е��÷���: before()");
    }

    // �� action ֮�����
    public void after(){
        System.out.println("�������� InterceptorClass �е��÷���: after()");
    }
}