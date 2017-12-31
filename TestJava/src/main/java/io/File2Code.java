package io;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

public class File2Code {

    /**
     * <p>���ļ�ת��base64 �ַ���</p>
     * @param path �ļ�·��
     * @return
     * @throws Exception
     */
    public static String encodeBase64File(String path) throws Exception {
        File  file = new File(path);
        FileInputStream inputFile = new FileInputStream(file);
        byte[] buffer = new byte[(int)file.length()];
        inputFile.read(buffer);
        inputFile.close();
        return new BASE64Encoder().encode(buffer);
    }
    /**
     * <p>��base64�ַ����뱣���ļ�</p>
     * @param base64Code
     * @param targetPath
     * @throws Exception
     */
    public static void decoderBase64File(String base64Code,String targetPath) throws Exception {
        byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
        FileOutputStream out = new FileOutputStream(targetPath);
        out.write(buffer);
        out.close();
    }
    /**
     * <p>��base64�ַ������ı��ļ�</p>
     * @param base64Code
     * @param targetPath
     * @throws Exception
     */
    public static void toFile(String base64Code,String targetPath) throws Exception {
        byte[] buffer = base64Code.getBytes();
        FileOutputStream out = new FileOutputStream(targetPath);
        out.write(buffer);
        out.close();
    }
    
    public static String readCode(){
    	InputStreamReader inputReader = null;
        BufferedReader bufferReader = null;
        String str = "";
        try{
            InputStream inputStream = new FileInputStream("D:\\vin.txt");
            inputReader = new InputStreamReader(inputStream);
            bufferReader = new BufferedReader(inputReader);
             
            // ��ȡһ��
            String line = null;
            StringBuffer strBuffer = new StringBuffer();
                 
            while ((line = bufferReader.readLine()) != null)
            {
                strBuffer.append(line);
            } 
            str = strBuffer.toString();
        } catch (IOException e){
            
        }
        return str;
    }

    public static void main(String[] args) {
        try {
//            String base64Code =encodeBase64File("D:\\1.jpg");
//            System.out.println(base64Code);
//            decoderBase64File(base64Code, "D:\\2.jpg");
//            toFile(base64Code, "D:\\three.txt");
        	//System.out.println(readCode());
        	decoderBase64File(readCode(), "D:\\x.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
