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
public class AccessUtil {
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
     * 空白mdb文件路径，直接保存在src/access/template/下
     */
    private final String blankMdbFilePath = "access/template/";   
    /**
     * 空白mdb文件名
     */
    private final String blankMdbFileName = "blank.mdb";   
    /**
     * 需要保存到的新的mdb文件路径和名称
     */
    private String savedMdbFilePathAndName = defaultSavedMdbFilePath + defaultSavedMdbFileName;   
    /**
     * 新mdb文件路径
     */
    public static final String defaultSavedMdbFilePath = "D:/WORK/WorkSpace/YonyouWorkspace/Test/src/access/mdb/";   
    /**
     * 新mdb文件名
     */
    public static final String defaultSavedMdbFileName = "data.mdb";   
    /**
     * mdb文件名后缀
     */
    public static final String defaultSavedMdbFileExtension = ".mdb";   
       
    /**
     * 饿汉式单例模式
     */
    private static AccessUtil instance = new AccessUtil();
    /**
     * 构造方法
     */
    private AccessUtil() {   
    }
    /**
     * 得到此类的对象，单例模式
     * @return 对象
     */
    public static AccessUtil getInstance() {   
        return instance;   
    }   
    /**
     * 设置新文件保存的路径和名称
     * @param newFilePathAndName 新文件保存的路径和名称
     */
    public void setSavedFilePathAndName(String newFilePathAndName) {   
        this.savedMdbFilePathAndName = newFilePathAndName;   
    }   
    /**
     * 删除旧文件
     */
    public void deleteOldMdbFile() {
        File oldTargetFile = new File(savedMdbFilePathAndName);   
        if (oldTargetFile.exists()) {   
            oldTargetFile.delete();   
        }   
    }
    /**
     * 通过复制模板文件来生成新的MDB文件
     * @throws Exception 异常
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
     * 连接Access数据库
     * @throws Exception 异常
     */
    public void connetAccessDB() throws Exception {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");   
        String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=" + savedMdbFilePathAndName.trim() + ";DriverID=22;READONLY=true}";   
        connection = DriverManager.getConnection(database, "", "");   
        statement = connection.createStatement();
    }
    /**
     * 新增
     * @param sql sql
     * @throws SQLException 异常
     */
    public void insert(String sql) throws SQLException{
    	statement.executeUpdate(sql);
    }
    /**
     * 查询
     * @param sql sql
     * @throws SQLException 异常
     */
    public void query(String sql) throws SQLException{
    	rs = statement.executeQuery(sql);
    	while(rs.next()) {
    		System.out.println(rs.getString("sst_code"));
    	}
    }
    /**
     * 关闭连接
     * @throws SQLException 异常
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
		AccessUtil.getInstance().copyBlankMdbFile();
		AccessUtil.getInstance().connetAccessDB();
		String sql = "insert into detail(sst_code,sst_name)values('74301111','阿斯蒂芬')"; 
		AccessUtil.getInstance().insert(sql);
		AccessUtil.getInstance().closeConnection();
	}
}
