package procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CallProcedure {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement proc = null;
		try {
			//加载Oracle驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//获得Oracle数据库连接 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "jswr", "jswr");
			//创建Oracle存储过程的对象，调用存储过程 
			proc = conn.prepareCall("{call TEST_PARAMETERS(?,?,?)}");
			//给Oracle存储过程的参数赋值 ，将第一个参数的值设为21
			proc.setInt(1, 21);
			proc.setInt(2, 3);
			//注册存储过程的第三个参数
			proc.registerOutParameter(3, java.sql.Types.INTEGER);
			//执行Oracle存储过程
			proc.execute();
			//得到存储过程的输出参数值并打印出来
			System.out.println("结果为："+proc.getInt(3));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}