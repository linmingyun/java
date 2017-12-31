package access;


import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
 
 
public class DBDemo { 
    Connection con; 
    Statement stm; 
    String sql; 
    ResultSet rs; 
 
    DBDemo() { //���췽�����г�ʼ�� 
        try { 
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
            con = DriverManager.getConnection 
                  ("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=D://blank.mdb"); 
            stm = con.createStatement(); 
        } catch(SQLException e) { 
            e.printStackTrace(); 
        } catch(ClassNotFoundException e) { 
            e.printStackTrace(); 
        } 
    } 
 
    public void insert() { //�������� 
        sql = "insert into detail(sst_code,sst_name)values('74301111','xxxx')"; 
        try { 
            int i = stm.executeUpdate(sql); 
            //            System.out.println("i="+i);; 
            if(i > 0) { //i��ֵ��ʾ�������ļ�¼������i=0��ʾδ�������ݿ���� 
                System.out.println("��ӳɹ���"); 
            } 
        } catch(SQLException e) { 
            System.out.println("���ʧ�ܣ�"); 
            //            e.printStackTrace(); 
        } 
    } 
 
 
    public void update() { //�޸����� 
        sql = "update student set Sname='����2' where Sno='005'"; 
        try { 
            int i = stm.executeUpdate(sql); 
            if(i > 0) { 
                System.out.println("�޸ĳɹ���"); 
            } else { 
                System.out.println("�޸�ʧ�ܣ�"); 
            } 
        } catch(SQLException e) { 
            System.out.println("�޸�ʧ�ܣ�"); 
        } 
    } 
 
 
    public void delete() { //ɾ������ 
        sql = "delete from student where Sno='005'"; 
        try { 
            int i = stm.executeUpdate(sql); 
            if(i > 0) { 
                System.out.println("ɾ���ɹ���"); 
            } else { 
                System.out.println("ɾ��ʧ�ܣ�"); 
            } 
        } catch(SQLException e) { 
            System.out.println("ɾ��ʧ�ܣ�"); 
        } 
    } 
 
 
    public void query() { //��ѯ���� 
        sql = "select * from detail"; 
        try { 
            rs = stm.executeQuery(sql); 
            while(rs.next()) { 
                System.out.println(rs.getString("sst_code")); 
            } 
        } catch(SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
 
    public static void main(String[] args) { 
        DBDemo d = new DBDemo(); 
 
        d.query(); 
 
        d.insert(); 
        d.query(); 
// 
//        d.update(); 
//        d.query(); 
// 
//        d.delete(); 
//        d.query(); 
 
 
        try { 
            d.rs.close(); 
            d.stm.close(); 
            d.con.close(); 
        } catch(SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
} 