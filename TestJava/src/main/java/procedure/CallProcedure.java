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
			//����Oracle����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//���Oracle���ݿ����� 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "jswr", "jswr");
			//����Oracle�洢���̵Ķ��󣬵��ô洢���� 
			proc = conn.prepareCall("{call TEST_PARAMETERS(?,?,?)}");
			//��Oracle�洢���̵Ĳ�����ֵ ������һ��������ֵ��Ϊ21
			proc.setInt(1, 21);
			proc.setInt(2, 3);
			//ע��洢���̵ĵ���������
			proc.registerOutParameter(3, java.sql.Types.INTEGER);
			//ִ��Oracle�洢����
			proc.execute();
			//�õ��洢���̵��������ֵ����ӡ����
			System.out.println("���Ϊ��"+proc.getInt(3));
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