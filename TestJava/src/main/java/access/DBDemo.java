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
 
    DBDemo() { //构造方法进行初始化 
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
 
    public void insert() { //插入数据 
        sql = "insert into detail(sst_code,sst_name)values('74301111','xxxx')"; 
        try { 
            int i = stm.executeUpdate(sql); 
            //            System.out.println("i="+i);; 
            if(i > 0) { //i的值表示语句操作的记录数量，i=0表示未进行数据库操作 
                System.out.println("添加成功！"); 
            } 
        } catch(SQLException e) { 
            System.out.println("添加失败！"); 
            //            e.printStackTrace(); 
        } 
    } 
 
 
    public void update() { //修改数据 
        sql = "update student set Sname='王欢2' where Sno='005'"; 
        try { 
            int i = stm.executeUpdate(sql); 
            if(i > 0) { 
                System.out.println("修改成功！"); 
            } else { 
                System.out.println("修改失败！"); 
            } 
        } catch(SQLException e) { 
            System.out.println("修改失败！"); 
        } 
    } 
 
 
    public void delete() { //删除数据 
        sql = "delete from student where Sno='005'"; 
        try { 
            int i = stm.executeUpdate(sql); 
            if(i > 0) { 
                System.out.println("删除成功！"); 
            } else { 
                System.out.println("删除失败！"); 
            } 
        } catch(SQLException e) { 
            System.out.println("删除失败！"); 
        } 
    } 
 
 
    public void query() { //查询数据 
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