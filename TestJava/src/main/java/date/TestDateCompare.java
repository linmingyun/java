package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �Ƚ����ڴ�С
 */
public class TestDateCompare {
    
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //�������ڸ�ʽ

    public static void main(String[] args) throws ParseException {
        Date startDate = sdf.parse("2016-04-15 11:11:11");
        Date endDate = sdf.parse("2016-04-16 11:11:11");
        
        if(startDate.before(endDate)){
            System.out.println("startDateС��endDate");
        }else if(startDate.after(endDate)){
            System.out.println("startDate����endDate");
        }else{
            System.out.println("startDate����endDate");
        }
        
        if(endDate.after(startDate)){
            System.out.println("endDate����startDate");
        }
        
        System.out.println(startDate.compareTo(endDate));
        System.out.println(endDate.compareTo(startDate));
        System.out.println(endDate.compareTo(endDate));
    }
}
