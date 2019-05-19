package assignmentThree;
//CECS 277 Assignment 3
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil{
	public static Calendar convertStringDatetoCalendarDate(String date) {
		Calendar cDate = Calendar.getInstance();
		cDate.set(getYear(date), getMonth(date), getDay(date));		
		return cDate;
	}
	
	private static int getDay(String date)
	{
		return getPart(date, 2, 4);
	}
	
	private static int getMonth(String date)
	{
		return getPart(date, 0, 2);
	}
	
	private static int getYear(String date)
	{
		return getPart(date, 4, 8);
	}
	
	private static int getPart(String date, int from, int to)
	{
		return Integer.parseInt(date.substring(from, to));
	}

	
	public static String getFormattedDate(Calendar convertStringDatetoCalendarDate)
	{		
		Calendar cDate = convertStringDatetoCalendarDate;
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM-dd-yyyy");
		
		String strDate = sdf.format(cDate.getTime());		
		
		return strDate;
	}
	
}
