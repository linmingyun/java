package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//���ע������Զ����ע��Component���������˭�ģ�
//����ElementType.TYPE��ʾ���ע��������������͵ģ�Ҳ���ǿ��Ա���ࡢ�ӿڵȡ�
//���⻹��FIELD��METHOD�ȣ��ֱ��ʾ��������ֶΡ������ȡ�
@Target(ElementType.TYPE)
//��ʾ����Զ����ע����Ҫ������ʲôʱ����ֻ������Դ���У�����֮���û���ˣ�
//���߱���������ʱ�����������е�ʱ��Ҳһֱ�С���������Ϊ����ʱ��
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    public String id();
}