package assignmentThree;
//CECS 277 Assignment 1
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class SportingEvent extends Event {
	
	public SportingEvent(String date, Venue vObj, String name, double ticketPrice, String teamOne, String teamTwo) {
		super(name, vObj, date, ticketPrice);
		sTeamOne = teamOne;
		sTeamTwo = teamTwo;
	}
	
	public String getTeamOne()
	{
		return sTeamOne;
	}
	
	public String getTeamTwo()
	{
		return sTeamTwo;
	}
	
	@Override
	public int compareTo(Event e)
	{
		//Music > Sporting
		if(!(e instanceof SportingEvent)) return 1;
		
		SportingEvent s = (SportingEvent)e;
		
		return sTeamOne.compareTo(s.sTeamOne);
	}

	@Override
	public String getType() {
		return "Sporting";
	}
	
	public String toString()
	{
		return ", Teams: " + sTeamOne + " VS " + sTeamTwo;
	}
	
	private String sTeamOne;
	private String sTeamTwo;
}
