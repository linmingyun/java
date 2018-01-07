package pattern06.adapter.classadapter;

/**
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。
 * 主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。首先，我们来看看类的适配器模式。
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口时Targetable，
 * 通过Adapter类，将Source的功能扩展到Targetable里。
 * Adapter类继承Source类，实现Targetable接口。
 * 这样Targetable接口的实现类就具有了Source类的功能。
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}