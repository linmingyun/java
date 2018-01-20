package annotation;

import java.lang.reflect.Method;

public class TestAnnotation {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        run(cal);
    }
    public static void run(Object obj) throws Exception {
        for (Method m : obj.getClass().getMethods()) {
            Test t = m.getAnnotation(Test.class);
            if (t != null && !t.ignore()) {
                m.invoke(obj);
            }
        }
    }
}
