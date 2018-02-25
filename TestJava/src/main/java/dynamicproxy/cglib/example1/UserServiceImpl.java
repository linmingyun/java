package dynamicproxy.cglib.example1;

public class UserServiceImpl {
    public void add() {
        System.out.println("This is add service");
    }
    public void delete(int id) {
        System.out.println("This is delete service£ºdelete " + id );
    }
}