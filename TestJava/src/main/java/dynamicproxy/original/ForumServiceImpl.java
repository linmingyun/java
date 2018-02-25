package dynamicproxy.original;

public class ForumServiceImpl implements ForumService {

    public void removeTopic(int topicId) {
        //��-1��ʼ�Ը÷����������ܼ���
        PerformanceMonitor.begin("ForumServiceImpl.removeTopic");
        System.out.println("ģ��ɾ��Topic��¼:"+topicId);
        try {
            Thread.currentThread().sleep(20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //��-2�����Ը÷����������ܼ���
        PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
        //��-1��ʼ�Ը÷����������ܼ���
        PerformanceMonitor.begin("ForumServiceImpl.removeForum");
        System.out.println("ģ��ɾ��Forum��¼:"+forumId);
        try {
            Thread.currentThread().sleep(40);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //��-2�����Ը÷����������ܼ���
        PerformanceMonitor.end();
    }
}