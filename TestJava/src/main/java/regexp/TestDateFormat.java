package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDateFormat {
	public static void main(String[] args) {
        String checkValue = "2016/1/30";
        String eL= "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";        
        Pattern p = Pattern.compile(eL);         
        Matcher m = p.matcher(checkValue);         
        boolean b = m.matches();        
        if(b)        
        {
                System.out.println("��ʽ��ȷ");        
        }        
        else     
        {        
                System.out.println("��ʽ����");        
        } 
	}
}
