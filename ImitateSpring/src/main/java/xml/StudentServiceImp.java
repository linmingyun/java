package xml;


public class StudentServiceImp implements StudentService {

    StudentDao studentDao=null;

    public StudentDao getStudentDao() {
        return studentDao;
    }
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void add(Student student) {
        studentDao.add(student);

    }

}