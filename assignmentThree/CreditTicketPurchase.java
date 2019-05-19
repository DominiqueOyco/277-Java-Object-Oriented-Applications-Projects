package assignmentThree;
//CECS 277 Assignment 3
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class CreditTicketPurchase extends TicketPurchase{
	public CreditTicketPurchase(String subscriber, Event e, String purchaseDate)
	{
		super(subscriber, e, purchaseDate);
	}

	@Override
	public String getType() 
	{
		return "Credit";
	}
}
