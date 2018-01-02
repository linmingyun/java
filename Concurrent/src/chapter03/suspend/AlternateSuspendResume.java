package chapter03.suspend;

/**
 * �ɽ�����Կ�������������н����Ϊtrue�����ȣ�������1���̹߳����λ�ò�ȷ������
 * ����ȷ�����̹߳����λ�ã���������߳���stepOne������stepTwo����֮�����������
 * ������2��main�߳���ִ��asr.areValuesEqual()���бȽ�ʱ��
 * ǡ��stepOne����ִ���꣬��stepTwo������ûִ�У����ڷ������������
 * ��û��ִ��asr.areValuesEqual()����ǰ����main�߳�����450ms��>300ms����
 * ����������󷢳�ʱ�����߳���ִ�е��򼴽�ִ�е�stepOne����
 * ���������ǰ��Ļ����ͻ���Ӧ�������󣬴Ӷ������̣߳�����ô��stepTwo����ִ��ǰ��
 * main�̵߳����߻�û�������Ӷ�main�߳����߽�����ִ��asr.areValuesEqual()�������бȽ�ʱ��
 * stepTwo�����Ѿ�ִ���꣬���Ҳ�������������Ϊfalse�������
 * ���Խ�ars.suspendRequest()������sleep����ȥ����������ʱ���Ϊ200������С��300���ɣ���
 * �鿴ִ�н�����ᷢ�ֽ������Ȼ���г���false�������
 * �ܽ᣺�̵߳Ĺ���ͻָ�ʵ�ֵ���ȷ�����ǣ�ͨ�����ñ�־λ�����߳��ڰ�ȫ��λ�ù���
 *
 * ��ֹ�߳�
 * ������Thread��start()������ִ����run()�����󣬻���run()������return���̱߳����Ȼ������
 * ����Thread API�а�����һ��stop()����������ͻȻ��ֹ�̡߳�
 * ������JDK1.2��㱻��̭�ˣ���Ϊ�����ܵ������ݶ���ı�����
 * һ�������ǣ����߳���ֹʱ�������л���ִ����������
 * ��һ�������ǣ�����ĳ���߳��ϵ���stop()����ʱ���߳��ͷ�����ǰ���е���������
 * ������Щ���ض���ĳ�ֺ��ʵ����ɡ���Ҳ������ֹ�����̷߳�����δ����һ����״̬�����ݣ�
 * ͻȻ�ͷ�������ʹĳЩ�����е����ݴ��ڲ�һ��״̬�����Ҳ���������ݿ��ܱ������κξ��档
 * ��ֹ�̵߳����������ͬ����ʹ�ñ�־λ��ͨ�����Ʊ�־λ����ֹ�̡߳�
 */
public class AlternateSuspendResume extends Object implements Runnable {

    private volatile int firstVal;
    private volatile int secondVal;
    //���ӱ�־λ������ʵ���̵߳Ĺ���ͻָ�
    private volatile boolean suspended;

    public boolean areValuesEqual() {
        return ( firstVal == secondVal );
    }

    public void run() {
        try {
            suspended = false;
            firstVal = 0;
            secondVal = 0;
            workMethod();
        } catch ( InterruptedException x ) {
            System.out.println("interrupted while in workMethod()");
        }
    }

    private void workMethod() throws InterruptedException {
        int val = 1;

        while ( true ) {
            //�����̹߳���ʱ�����������д���
            waitWhileSuspended();

            stepOne(val);
            stepTwo(val);
            val++;

            //�����̹߳���ʱ�����������д���
            waitWhileSuspended();

            Thread.sleep(200);
        }
    }

    private void stepOne(int newVal)
            throws InterruptedException {

        firstVal = newVal;
        Thread.sleep(300);
    }

    private void stepTwo(int newVal) {
        secondVal = newVal;
    }

    public void suspendRequest() {
        suspended = true;
    }

    public void resumeRequest() {
        suspended = false;
    }

    private void waitWhileSuspended()
            throws InterruptedException {

        //����һ������æ�ȴ���������ʾ����
        //���Ƿǵȴ������ı�����;������Ϊ���᲻�������������ڵ�ִ�м�飬
        //���ѵļ����ǣ�ʹ��Java�����á�֪ͨ-�ȴ�������
        while ( suspended ) {
            Thread.sleep(200);
        }
    }

    public static void main(String[] args) {
        AlternateSuspendResume asr =
                new AlternateSuspendResume();

        Thread t = new Thread(asr);
        t.start();

        //����1�룬�������߳��л�����ִ��
        try { Thread.sleep(1000); }
        catch ( InterruptedException x ) { }

        for ( int i = 0; i < 10; i++ ) {
            asr.suspendRequest();

            //���߳��л���ע�⵽��������
            //ע�⣺��������ʱ��һ��Ҫ����
            //stepOne������firstVal��ֵ�������ʱ�䣬��300ms��
            //Ŀ����Ϊ�˷�ֹ��ִ��asr.areValuesEqual()���бȽ�ʱ,
            //ǡ��stepOne����ִ���꣬��stepTwo������ûִ��
            try { Thread.sleep(350); }
            catch ( InterruptedException x ) { }

            System.out.println("dsr.areValuesEqual()=" + asr.areValuesEqual());

            asr.resumeRequest();

            try {
                //�߳��������0~2��
                Thread.sleep(( long ) (Math.random() * 2000.0));
            } catch ( InterruptedException x ) {
                //��
            }
        }

        System.exit(0); //�˳�Ӧ�ó���
    }
}