package io;

import java.io.*;

public class WriteCSV {

	public static void main(String[] args) {
		//createCsvFile();
		createCsv();
	}
	
	/**
	 * ���������������
	 */
	public static void createCsvFile(){
		try {
			File csv = new File("D:\\test.csv"); // CSV�ļ�
			// ׷��ģʽ
			BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true));
			// ����һ������
			bw.write("��ǹ�İ�����" + "," + "2009" + "," + "1212");
			bw.newLine();
			bw.write("��ǹ�İ�����" + "," + "2009" + "," + "1212");
			bw.newLine();
			bw.write("��ǹ�İ�����" + "," + "2009" + "," + "1212");
			bw.close();
		} catch (FileNotFoundException e) {
			// ����File��������ʱ���쳣
			e.printStackTrace();
		} catch (IOException e) {
			// ����BufferedWriter����ر�ʱ���쳣
			e.printStackTrace();
		}
	}
	
	/**
	 * ���û����������
	 */
	public static void createCsv(){
		try {
			File csv = new File("D:\\test.csv"); // CSV�ļ�
			// ׷��ģʽ
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(csv), "GB2312"), 1024);
			// ����һ������
			bw.write("��ǹ�İ�����" + "," + "2009" + "," + "1212");
			bw.newLine();
			bw.write("��ǹ�İ�����" + "," + "2009" + "," + "1212");
			bw.newLine();
			bw.write("��ǹ�İ�����" + "," + "2009" + "," + "1212");
			bw.close();
		} catch (FileNotFoundException e) {
			// ����File��������ʱ���쳣
			e.printStackTrace();
		} catch (IOException e) {
			// ����BufferedWriter����ر�ʱ���쳣
			e.printStackTrace();
		}
	}
}