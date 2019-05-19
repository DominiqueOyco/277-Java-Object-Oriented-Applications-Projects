package assignmentThree;
//CECS 277 Assignment 3
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Event implements Displayable, Comparable<Event>{	
	public Event(String date, Venue venueName, String eventName, double ticketPrice){
		eDate = TicketPurchase.convertStringDatetoCalendarDate(date);
		eVenueName = venueName;
		eEventName = eventName;
		eTicketPrice = ticketPrice;
		eTicketPurchase = new ArrayList<TicketPurchase>();		
	}

	public Calendar getDate()
	{
		return eDate;
	}
	
	public Venue getVenueName()
	{
		return eVenueName;
	}

	public String getEventName()
	{
		return eEventName;
	}
	
	public double getTicketPrice()
	{
		return eTicketPrice;
	}
	
	public ArrayList<TicketPurchase> getTicketPurchases()
	{
		return getTicketPurchases("5050");
	}
	
	public ArrayList<TicketPurchase> getTicketPurchases(String beforeDate)
	{
		ArrayList<TicketPurchase> ticketPurchase = new ArrayList<TicketPurchase>();
		Calendar bDate= TicketPurchase.convertStringDatetoCalendarDate(beforeDate);
		
		for(TicketPurchase tp : eTicketPurchase)
		{
			if(tp.getPurchaseDate().before(bDate)) ticketPurchase.add(tp); 
		}
		
		return ticketPurchase;
	}
	
	@Override
	public String toString()
	{
		return "Type: " + getType() + ", Name: " + getEventName() + "," + display() ;
	}
	
	@Override
	public String display()
	{
		String output = eVenueName.toString() + ", Occurs on: " + DateUtil.getFormattedDate(eDate)
						+ ", Ticket Price: " + getTicketPrice();
		return output;
		//return null;					
	}

	public void addTicketPurchase(TicketPurchase tp)
	{
		eTicketPurchase.add(tp);
	}
	
	public abstract String getType();
	
	private Calendar eDate;
	private Venue eVenueName;
	private String eEventName;
	private double eTicketPrice;
	private List<TicketPurchase> eTicketPurchase;
}