package file;

import java.io.File;
import java.io.IOException;

/**
 * java之文件的创建与删除
 */
public class TestFileCreateAndDelete {

	public static void main(String[] args) {
		//获取某个文件夹
		File f = new File("D:" + File.separator + "WORK");
		if(f.isDirectory()){ //如果D盘下面存在名为WORK的文件夹，则会打印出路径
			System.out.println(f.getPath());
		}
		//创建文件
		String path = "D:" + File.separator + "TEST" + File.separator;
		String fileName = "MyFile.txt";
		File file = new File(path, fileName);
		System.out.println(path + fileName);
		try {
			if(file.exists()){
				System.out.println("文件路径：" + file.getAbsolutePath());
				System.out.println("文件大小：" + file.length());
				//删除文件
				file.delete();
				System.out.println("文件已删除！");
			}else{
				//先创建文件所在目录，否则系统找不到指定的路径。
				file.getParentFile().mkdirs();
				//创建文件
				file.createNewFile();
				System.out.println("文件创建成功！");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
