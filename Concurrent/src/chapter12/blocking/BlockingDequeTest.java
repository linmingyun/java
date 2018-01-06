package chapter12.blocking;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * ����ջ�������������ƣ�ֻ������Java 6�м���������ԣ�
 * ����ջ�Ľӿ�java.util.concurrent.BlockingDequeҲ�кܶ�ʵ���࣬
 * ʹ�÷���Ҳ�Ƚ����ƣ�����鿴JDK�ĵ���
 * �ӽ���п��Կ�����������˵�20��Ԫ�غ����Ǵӽ�ջ��Ԫ���ƴ���
 * ��������Լ�����ջ�����Ԫ�أ�֮��ÿ���һ��Ԫ�أ�
 * �㽫ջ��Ԫ���Ƴ���������������ִ�н�����
 */
public class BlockingDequeTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> bDeque = new LinkedBlockingDeque<String>(20);
        for (int i = 0; i < 30; i++) {
            //��ָ��Ԫ����ӵ�������ջ��
            bDeque.putFirst("" + i);
            System.out.println("������ջ�������Ԫ��:" + i);
            if(i > 18){
                //������ջ��ȡ��ջ��Ԫ�أ��������Ƴ�
                System.out.println("������ջ���Ƴ���Ԫ�أ�" + bDeque.pollFirst());
            }
        }
        System.out.println("���򵽴����н����������˳�----");
    }
}