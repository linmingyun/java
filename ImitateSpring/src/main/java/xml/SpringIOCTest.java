package xml;

public class SpringIOCTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        StudentService service = (StudentService) context.getBean("studentService");
        Student student = new Student(1,"��һ",null,null);
        service.add(student);
    }
}