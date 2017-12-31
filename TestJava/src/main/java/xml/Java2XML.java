package xml;

/**
 * desciption:java create xml file
 * author:maomao
 * datetime:2007/04/04 23:42
 */

//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.JDOMException;
//import org.jdom.output.XMLOutputter;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.output.XMLOutputter;

import java.io.FileOutputStream;
import java.io.IOException;

public class Java2XML {
 
    public void BuildXMLDoc() throws IOException, JDOMException {
 
       // �������ڵ� list;
        Element root = new Element("list");
      
       // ���ڵ���ӵ��ĵ��У�
        Document Doc = new Document(root);
 
       // �˴� for ѭ�����滻�� ���� ���ݿ��Ľ��������;
       for (int i = 0; i < 5; i++) {
          
           // �����ڵ� user;
           Element elements = new Element("user");
          
           // �� user �ڵ�������� id;
           elements.setAttribute("id", "" + i);
          
           // �� user �ڵ�����ӽڵ㲢��ֵ��
           // new Element("name")�е� "name" �滻�ɱ�����Ӧ�ֶΣ�setText("xuehui")�� "xuehui �滻�ɱ��м�¼ֵ��
           elements.addContent(new Element("name").setText("xuehui"));
           elements.addContent(new Element("age").setText("28"));
           elements.addContent(new Element("sex").setText("Male"));
 
           // �����ڵ�list���user�ӽڵ�;
           root.addContent(elements);
 
       }
        XMLOutputter XMLOut = new XMLOutputter();
      
       // ��� user.xml �ļ���
        XMLOut.output(Doc, new FileOutputStream("user.xml"));
    }
 
    public static void main(String[] args) {
       try {
           Java2XML j2x = new Java2XML();
           System.out.println("���� mxl �ļ�...");
           j2x.BuildXMLDoc();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

}