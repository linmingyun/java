package thread;

/**
 * ThreadLocal�÷�
 * @author coshaho
 *
 */
public class MyThreadLocal {
    private static final ThreadLocal<Object> threadLocal = new ThreadLocal<Object>(){
        /**
         * ThreadLocalû�б���ǰ�̸߳�ֵʱ��ǰ�̸߳յ���remove���������get���������ش˷���ֵ
         */
        @Override
        protected Object initialValue()
        {
            System.out.println("����get����ʱ����ǰ�̹߳������û�����ã�����initialValue��ȡĬ��ֵ��");
            return null;
        }
    };

    public static void main(String[] args)
    {
        new Thread(new MyIntegerTask("IntegerTask1")).start();
        new Thread(new MyStringTask("StringTask1")).start();
        new Thread(new MyIntegerTask("IntegerTask2")).start();
        new Thread(new MyStringTask("StringTask2")).start();
    }

    public static class MyIntegerTask implements Runnable
    {
        private String name;

        MyIntegerTask(String name)
        {
            this.name = name;
        }

        public void run()
        {
            for(int i = 0; i < 5; i++)
            {
                // ThreadLocal.get������ȡ�̱߳���
                if(null == MyThreadLocal.threadLocal.get())
                {
                    // ThreadLocal.et���������̱߳���
                    MyThreadLocal.threadLocal.set(0);
                    System.out.println("�߳�" + name + ": 0");
                }
                else
                {
                    int num = (Integer)MyThreadLocal.threadLocal.get();
                    MyThreadLocal.threadLocal.set(num + 1);
                    System.out.println("�߳�" + name + ": " + MyThreadLocal.threadLocal.get());
                    if(i == 3)
                    {
                        MyThreadLocal.threadLocal.remove();
                    }
                }
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }

    }

    public static class MyStringTask implements Runnable
    {
        private String name;

        MyStringTask(String name)
        {
            this.name = name;
        }

        public void run()
        {
            for(int i = 0; i < 5; i++)
            {
                if(null == MyThreadLocal.threadLocal.get())
                {
                    MyThreadLocal.threadLocal.set("a");
                    System.out.println("�߳�" + name + ": a");
                }
                else
                {
                    String str = (String)MyThreadLocal.threadLocal.get();
                    MyThreadLocal.threadLocal.set(str + "a");
                    System.out.println("�߳�" + name + ": " + MyThreadLocal.threadLocal.get());
                }
                try
                {
                    Thread.sleep(800);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }

    }
}