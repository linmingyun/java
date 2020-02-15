package xml;

public class StudentDaoImp implements StudentDao {

    public void add(Student student) {
        System.out.println(student.getName()+" is saved");
    }

}