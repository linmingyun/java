package pattern23.interpreter;

/**
 * ������ģʽһ����ҪӦ����OOP�����еı������Ŀ����У�����������Ƚ�խ��
 * Context����һ�������Ļ����࣬Plus��Minus�ֱ������������ʵ�֡�
 * ������ģʽ���������ָ����Ľ����������������ʽ�ȵĽ������ȵȣ�
 */
public class Test {

    public static void main(String[] args) {

        // ����9+2-8��ֵ
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}