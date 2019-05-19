package assignmentThree;
//CECS 277 Assignment 3
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class Venue implements Displayable, Comparable<Venue>{
	
	public Venue(String name, int capacity)
	{
		vName = name;
		vCapacity = capacity;
	}

	public String getName()
	{
		return vName;
	}
	
	public int getCapacity()
	{
		return vCapacity;
	}
	
	@Override
	public String toString()
	{
		return "Venue: " + vName + ", Capacity: " + vCapacity;
	}
	
	@Override
	public String display()
	{
		return toString();
	}
	
	@Override
	public int compareTo(Venue v) {
		if(!(v instanceof Venue)) return 1;
		
		Venue o = (Venue)v;
				
		double capacityOne = getCapacity();
		double capacityTwo = o.getCapacity();
		
		if(capacityOne > capacityTwo) return -1;
		else if(capacityOne == capacityTwo) return 0;
		else return 1;
	}
	
	private String vName;
	private int vCapacity;
	
}