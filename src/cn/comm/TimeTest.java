package cn.comm;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeTest {
	
	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
		System.out.println(sdf.format(new Date()));
		System.out.println(new SimpleDateFormat("yyyyMMdd").format(new Date()));
		System.out.println(1436148937876l - 1436148906570l);
		System.out.println(1436149279286l - 1436149235300l);
		
		Date d = new SimpleDateFormat("yyyyMM").parse("201505");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		// 设置日期为本月最大日期   
		calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));   
		
		// 打印   
		DateFormat format = new SimpleDateFormat("yyyyMMdd");   
		String lstDate  = format.format(calendar.getTime());
		System.out.println(lstDate);  
		
		System.out.println(new SimpleDateFormat("yyyyMMdd").parse(lstDate));
	}
	
	
	
	
	
	
	
	
	
	
	
	{
		/*1.// 获取Calendar   
		2.Calendar calendar = Calendar.getInstance();   
		3.// 设置时间,当前时间不用设置   
		4.// calendar.setTime(new Date());   
		5.// 设置日期为本月最大日期   
		6.calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));   
		7.  
		8.// 打印   
		9.DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
		10.System.out.println(format.format(calendar.getTime()));  */
	}
}
