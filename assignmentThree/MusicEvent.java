package assignmentThree;

//CECS 277 Assignment 3
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class MusicEvent extends Event {
	public MusicEvent(String date, Venue vObj, String name, double ticketPrice, String band) {
		super(name, vObj, date, ticketPrice);
		mBand = band;
	}
	
	public String getBand()
	{
		return mBand;
	}
	
	@Override
	public int compareTo(Event e)
	{
		// Music < Sporting
		if(!(e instanceof MusicEvent)) return -1;
		
		MusicEvent m = (MusicEvent)e;				
		return mBand.compareTo(m.mBand);
	}

	@Override
	public String getType()
	{
		return "Music";
	}
	
	public String toString()
	{
		return ", Band: " + mBand;
	}
	
	private String mBand;
}
