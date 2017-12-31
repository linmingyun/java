package file;

import java.io.File;
import java.io.IOException;

/**
 * java֮�ļ��Ĵ�����ɾ��
 */
public class TestFileCreateAndDelete {

	public static void main(String[] args) {
		//��ȡĳ���ļ���
		File f = new File("D:" + File.separator + "WORK");
		if(f.isDirectory()){ //���D�����������ΪWORK���ļ��У�����ӡ��·��
			System.out.println(f.getPath());
		}
		//�����ļ�
		String path = "D:" + File.separator + "TEST" + File.separator;
		String fileName = "MyFile.txt";
		File file = new File(path, fileName);
		System.out.println(path + fileName);
		try {
			if(file.exists()){
				System.out.println("�ļ�·����" + file.getAbsolutePath());
				System.out.println("�ļ���С��" + file.length());
				//ɾ���ļ�
				file.delete();
				System.out.println("�ļ���ɾ����");
			}else{
				//�ȴ����ļ�����Ŀ¼������ϵͳ�Ҳ���ָ����·����
				file.getParentFile().mkdirs();
				//�����ļ�
				file.createNewFile();
				System.out.println("�ļ������ɹ���");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
