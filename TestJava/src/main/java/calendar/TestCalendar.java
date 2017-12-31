package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * java之Calendar的一些用法
 */
public class TestCalendar {

	public static void main(String[] args) throws ParseException {
		//Date转Calendar
		String time="2011-05-12 23:59:59";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //HH是24小时制，hh是12小时制
		Date date = sdf.parse(time);
		System.out.println(sdf.format(date));
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(sdf.format(c.getTime()));
		
		//日期加2天
		c.add(Calendar.DAY_OF_MONTH, 2);
		System.out.println(sdf.format(c.getTime()));
		
		//日期减1天
		c.add(Calendar.DATE, -1);
		System.out.println(sdf.format(c.getTime()));
		
		//年、月、日、时、分、秒
	    Calendar calendar = Calendar.getInstance();
	    int year = calendar.get(Calendar.YEAR);
	    int month = calendar.get(Calendar.MONTH)+1;
	    int day = calendar.get(Calendar.DATE);
	    int hour = calendar.get(Calendar.HOUR_OF_DAY);
	    int minute = calendar.get(Calendar.MINUTE);
	    int second = calendar.get(Calendar.SECOND);
	    System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);
	    
	    //星期
	    sdf = new SimpleDateFormat("yyyy-MM-dd");
		int i = calendar.get(Calendar.DAY_OF_WEEK) - 1; //值为0到6，分别代表星期天到星期六
		System.out.println("今天星期几：" + i);
		calendar.add(Calendar.DATE, -i); //上星期天
		String endDate = sdf.format(calendar.getTime());
		System.out.println("上星期天是：" + endDate);
		calendar.add(Calendar.DATE, -6); //上星期一
		String startDate = sdf.format(calendar.getTime());
		System.out.println("上星期一是：" + startDate);
	    
		//取当月的第一天与最后一天 
		Calendar cal = Calendar.getInstance(); 
	    cal.setTime(new Date()); 
	    cal.set(Calendar.DAY_OF_MONTH, 1); 
	    System.out.println("本月第一天：" + new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime())); 
	    cal.roll(Calendar.DAY_OF_MONTH, -1);  
		System.out.println("本月最后一天：" + new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
		System.out.println("本月最后一天：" + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
