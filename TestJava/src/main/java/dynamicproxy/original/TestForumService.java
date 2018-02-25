package dynamicproxy.original;

public class TestForumService {
    public static void main(String[] args) {
        ForumServiceImpl forumService = new ForumServiceImpl();
        forumService.removeForum(10);
        forumService.removeTopic(1012);
    }
}