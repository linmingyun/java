package calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * java֮Calendar��һЩ�÷�
 */
public class TestCalendar {

	public static void main(String[] args) throws ParseException {
		//DateתCalendar
		String time="2011-05-12 23:59:59";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //HH��24Сʱ�ƣ�hh��12Сʱ��
		Date date = sdf.parse(time);
		System.out.println(sdf.format(date));
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(sdf.format(c.getTime()));
		
		//���ڼ�2��
		c.add(Calendar.DAY_OF_MONTH, 2);
		System.out.println(sdf.format(c.getTime()));
		
		//���ڼ�1��
		c.add(Calendar.DATE, -1);
		System.out.println(sdf.format(c.getTime()));
		
		//�ꡢ�¡��ա�ʱ���֡���
	    Calendar calendar = Calendar.getInstance();
	    int year = calendar.get(Calendar.YEAR);
	    int month = calendar.get(Calendar.MONTH)+1;
	    int day = calendar.get(Calendar.DATE);
	    int hour = calendar.get(Calendar.HOUR_OF_DAY);
	    int minute = calendar.get(Calendar.MINUTE);
	    int second = calendar.get(Calendar.SECOND);
	    System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);
	    
	    //����
	    sdf = new SimpleDateFormat("yyyy-MM-dd");
		int i = calendar.get(Calendar.DAY_OF_WEEK) - 1; //ֵΪ0��6���ֱ���������쵽������
		System.out.println("�������ڼ���" + i);
		calendar.add(Calendar.DATE, -i); //��������
		String endDate = sdf.format(calendar.getTime());
		System.out.println("���������ǣ�" + endDate);
		calendar.add(Calendar.DATE, -6); //������һ
		String startDate = sdf.format(calendar.getTime());
		System.out.println("������һ�ǣ�" + startDate);
	    
		//ȡ���µĵ�һ�������һ�� 
		Calendar cal = Calendar.getInstance(); 
	    cal.setTime(new Date()); 
	    cal.set(Calendar.DAY_OF_MONTH, 1); 
	    System.out.println("���µ�һ�죺" + new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime())); 
	    cal.roll(Calendar.DAY_OF_MONTH, -1);  
		System.out.println("�������һ�죺" + new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
		System.out.println("�������һ�죺" + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
