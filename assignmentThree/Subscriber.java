package assignmentThree;

//CECS 277 Assignment 3
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Subscriber implements Displayable, Comparable<Subscriber>
{
	public Subscriber(String name, String birthDate)
	{
		mName = name;
		mBirthDate = TicketPurchase.convertStringDatetoCalendarDate(birthDate);
		mSubscriber = new ArrayList<TicketPurchase>();
	}

	public String getName()
	{
		return mName;
	}
	
	public String getBirthDate()
	{
		return DateUtil.getFormattedDate(mBirthDate);
	}

	public ArrayList<TicketPurchase> getTicketPurchases()
	{
		return getTicketPurchases("5050");
	}
	
	public ArrayList<TicketPurchase> getTicketPurchases(String name)
	{
		ArrayList<TicketPurchase> subscribers = new ArrayList<TicketPurchase>();
		
		for(TicketPurchase tp : mSubscriber)
		{
			subscribers.add(tp); 
		}
		
		return subscribers;
	}
	
	@Override
	public String toString()
	{
		return mName + ", Born: " + getBirthDate();
	}
	
	@Override
	public String display()
	{
		return toString();
	}
	
	@Override
	public int compareTo(Subscriber s)
	{
		return mName.compareTo(s.mName);
	}
	
	public void addTicketPurchase(TicketPurchase tp)
	{		
		mSubscriber.add(tp);		
	}

	private String mName;
	private Calendar mBirthDate;
	private List<TicketPurchase> mSubscriber;

}
