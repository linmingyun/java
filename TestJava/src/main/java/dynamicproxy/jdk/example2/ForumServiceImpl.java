package dynamicproxy.jdk.example2;

import dynamicproxy.original.ForumService;

public class ForumServiceImpl implements ForumService {

    public void removeTopic(int topicId) {

        System.out.println("ģ��ɾ��Topic��¼:"+topicId);
        try {
            Thread.currentThread().sleep(20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void removeForum(int forumId) {

        System.out.println("ģ��ɾ��Forum��¼:"+forumId);
        try {
            Thread.currentThread().sleep(40);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}