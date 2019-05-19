package assignmentThree;
//CECS 277 Assignment 3
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

import java.util.Calendar;

public abstract class TicketPurchase{
	public TicketPurchase(String subscriber, Event e, String purchaseDate)
	{
		tSubscriber = subscriber;
		tEventName = e;
		tPurchaseDate = convertStringDatetoCalendarDate(purchaseDate);
	}
	
	public String getSubscriber()
	{
		return tSubscriber;
	}
	
	public Event getEventName()
	{
		return tEventName;
	}

	public Calendar getPurchaseDate()
	{
		return tPurchaseDate;
	}
	
	public static Calendar convertStringDatetoCalendarDate(String date)
	{
		Calendar cDate = Calendar.getInstance();
		cDate.set(getYear(date), getMonth(date), getDay(date));
		
		return cDate;
	}
	
	@Override
	public String toString()
	{
		return getType() + ": " + DateUtil.getFormattedDate(tPurchaseDate);
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
	
	public abstract String getType();
	
	private Event tEventName;
	private String tSubscriber;
	private Calendar tPurchaseDate;
}

