package io;

import java.io.*;

public class FileTransfer {

	public static void main(String[] args) {
	    String separator = File.separator;
	    String filename = "myfile.txt";
	    String directory = "mydir1" + separator + "mydir2";
	    File f = new File(directory,filename);
	    if(f.exists()){
	      System.out.println("�ļ�����" + f.getAbsolutePath());
	      System.out.println("�ļ���С��" + f.length());
	    }else{
	      f.getParentFile().mkdirs();
	      try{
	        f.createNewFile();
	      }catch(IOException e){
	        e.printStackTrace();
	      }
	    }
	    
	    System.out.println(file2String(f,"utf-8"));
	}
	
    /** 
     * �ı��ļ�ת��Ϊָ��������ַ��� 
     * 
     * @param file         �ı��ļ� 
     * @param encoding �������� 
     * @return ת������ַ��� 
     * @throws IOException 
     */ 
    public static String file2String(File file, String encoding) { 
        InputStreamReader reader = null; 
        StringWriter writer = new StringWriter(); 
        try { 
                if (encoding == null || "".equals(encoding.trim())) { 
                        reader = new InputStreamReader(new FileInputStream(file), encoding); 
                } else { 
                        reader = new InputStreamReader(new FileInputStream(file)); 
                } 
                //��������д������� 
                char[] buffer = new char[1024]; 
                int n = 0; 
                while (-1 != (n = reader.read(buffer))) { 
                        writer.write(buffer, 0, n); 
                } 
        } catch (Exception e) { 
                e.printStackTrace(); 
                return null; 
        } finally { 
                if (reader != null) 
                        try { 
                                reader.close(); 
                        } catch (IOException e) { 
                                e.printStackTrace(); 
                        } 
        } 
        //����ת����� 
        if (writer != null) 
                return writer.toString(); 
        else return null; 
    }

    /** 
     * ���ַ���д��ָ���ļ�(��ָ���ĸ�·�����ļ��в�����ʱ��������޶�ȥ�������Ա�֤����ɹ���) 
     * 
     * @param res            ԭ�ַ��� 
     * @param filePath �ļ�·�� 
     * @return �ɹ���� 
     */ 
    public static boolean string2File(String res, String filePath) { 
        boolean flag = true; 
        BufferedReader bufferedReader = null; 
        BufferedWriter bufferedWriter = null; 
        try { 
                File distFile = new File(filePath); 
                if (!distFile.getParentFile().exists()) distFile.getParentFile().mkdirs(); 
                bufferedReader = new BufferedReader(new StringReader(res)); 
                bufferedWriter = new BufferedWriter(new FileWriter(distFile)); 
                char buf[] = new char[1024];         //�ַ������� 
                int len; 
                while ((len = bufferedReader.read(buf)) != -1) { 
                        bufferedWriter.write(buf, 0, len); 
                } 
                bufferedWriter.flush(); 
                bufferedReader.close(); 
                bufferedWriter.close(); 
        } catch (IOException e) { 
                e.printStackTrace(); 
                flag = false; 
                return flag; 
        } finally { 
                if (bufferedReader != null) { 
                        try { 
                                bufferedReader.close(); 
                        } catch (IOException e) { 
                                e.printStackTrace(); 
                        } 
                } 
        } 
        return flag; 
    }
}
