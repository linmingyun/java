package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 比较日期大小
 */
public class TestDateCompare {
    
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //设置日期格式

    public static void main(String[] args) throws ParseException {
        Date startDate = sdf.parse("2016-04-15 11:11:11");
        Date endDate = sdf.parse("2016-04-16 11:11:11");
        
        if(startDate.before(endDate)){
            System.out.println("startDate小于endDate");
        }else if(startDate.after(endDate)){
            System.out.println("startDate大于endDate");
        }else{
            System.out.println("startDate等于endDate");
        }
        
        if(endDate.after(startDate)){
            System.out.println("endDate大于startDate");
        }
        
        System.out.println(startDate.compareTo(endDate));
        System.out.println(endDate.compareTo(startDate));
        System.out.println(endDate.compareTo(endDate));
    }
}
