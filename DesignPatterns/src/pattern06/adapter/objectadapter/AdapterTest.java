package pattern06.adapter.objectadapter;

import pattern06.adapter.classadapter.Source;
import pattern06.adapter.classadapter.Targetable;

/**
 * 对象的适配器模式
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，
 * 而是持有Source类的实例，以达到解决兼容性的问题。
 * 输出与第一种一样，只是适配的方法不同而已。
 */
public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}