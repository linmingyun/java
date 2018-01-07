package pattern01.singleton.example5;

/**
 * 也有人这样实现：因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，
 * 单独为创建加synchronized关键字，也是可以的。
 * 考虑性能的话，整个程序只需创建一次实例，所以性能也不会有什么影响。
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}