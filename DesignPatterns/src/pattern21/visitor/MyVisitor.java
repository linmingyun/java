package pattern21.visitor;

public class MyVisitor implements Visitor {
    public void visit(Subject sub) {
        System.out.println("visit the subject£º"+sub.getSubject());
    }
}