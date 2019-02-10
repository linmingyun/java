package annotation;

import java.lang.reflect.InvocationTargetException;

public class BeanFactoryTester {

    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory("annotation");
        BusinessObject obj = null;
        try {
            obj = (BusinessObject) beanFactory.getBean("businessObject");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        obj.print();
    }

}