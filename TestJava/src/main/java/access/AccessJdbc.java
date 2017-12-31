package access;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Access
 * @author Administrator
 *
 */
public class AccessJdbc {
	/**
	 * Connection
	 */
    private Connection connection;
    /**
     * Statement
     */
    private Statement statement; 
    /**
     * ResultSet
     */
    private ResultSet rs;
    /**
     * �հ�mdb�ļ�·����ֱ�ӱ�����src/access/template/��
     */
    private final String blankMdbFilePath = "access/template/";   
    /**
     * �հ�mdb�ļ���
     */
    private final String blankMdbFileName = "blank.mdb";   
    /**
     * ��Ҫ���浽���µ�mdb�ļ�·��������
     */
    private String savedMdbFilePathAndName = defaultSavedMdbFilePath + defaultSavedMdbFileName;   
    /**
     * ��mdb�ļ�·��
     */
    public static final String defaultSavedMdbFilePath = "D:/WORK/WorkSpace/YonyouWorkspace/Test/src/access/mdb/";   
    /**
     * ��mdb�ļ���
     */
    public static final String defaultSavedMdbFileName = "data.mdb";   
    /**
     * mdb�ļ�����׺
     */
    public static final String defaultSavedMdbFileExtension = ".mdb";   
       
    /**
     * ����ʽ����ģʽ
     */
    private static AccessJdbc instance = new AccessJdbc();
    /**
     * ���췽��
     */
    private AccessJdbc() {   
    }
    /**
     * �õ�����Ķ��󣬵���ģʽ
     * @return ����
     */
    public static AccessJdbc getInstance() {   
        return instance;   
    }   
    /**
     * �������ļ������·��������
     * @param newFilePathAndName ���ļ������·��������
     */
    public void setSavedFilePathAndName(String newFilePathAndName) {   
        this.savedMdbFilePathAndName = newFilePathAndName;   
    }   
    /**
     * ɾ�����ļ�
     */
    public void deleteOldMdbFile() {
        File oldTargetFile = new File(savedMdbFilePathAndName);   
        if (oldTargetFile.exists()) {   
            oldTargetFile.delete();   
        }   
    }
    /**
     * ͨ������ģ���ļ��������µ�MDB�ļ�
     * @throws Exception �쳣
     */
    public void copyBlankMdbFile() throws Exception {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(blankMdbFilePath + blankMdbFileName);   
        OutputStream out = new FileOutputStream(savedMdbFilePathAndName);   
        byte[] buffer = new byte[1024];   
        int numRead;   
        while ((numRead = is.read(buffer)) != -1) {
            out.write(buffer, 0, numRead);
        }
        is.close();   
        out.close();   
    }
    /**
     * ����Access���ݿ�
     * @throws Exception �쳣
     */
    public void connetAccessDB() throws Exception {
        Class.forName("com.hxtt.sql.access.AccessDriver").newInstance();
        String url = "jdbc:Access:///"+savedMdbFilePathAndName.trim();
        connection = DriverManager.getConnection(url, "", "");
        statement = connection.createStatement();
    }
    /**
     * ����
     * @param sql sql
     * @throws SQLException �쳣
     */
    public void insert(String sql) throws SQLException{
    	statement.executeUpdate(sql);
    }
    /**
     * ��ѯ
     * @param sql sql
     * @throws SQLException �쳣
     */
    public void query(String sql) throws SQLException{
    	rs = statement.executeQuery(sql);
    	while(rs.next()) {
    		System.out.println(rs.getString("sst_code"));
    	}
    }
    /**
     * �ر�����
     * @throws SQLException �쳣
     */
    public void closeConnection() throws SQLException {   
    	if(null != rs){
    		rs.close();
    	}
    	if(null != statement){    		
    		statement.close();
    	}
    	if(null != connection){    		
    		connection.close();
    	}
    }
    
	public static void main(String[] args) throws Exception {
		AccessJdbc.getInstance().copyBlankMdbFile();
		AccessJdbc.getInstance().connetAccessDB();
		String sql = "insert into detail(sst_code,sst_name)values('74301111','��˹�ٷ�')"; 
		AccessJdbc.getInstance().insert(sql);
		AccessJdbc.getInstance().closeConnection();
	}
}
