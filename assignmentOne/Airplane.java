//CECS 277 Assignment 1
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

package assignmentOne;

public class Airplane extends Vehicle{
	
	public Airplane(){
		this("No Name Airplane");
	}
	
	public Airplane(String name){
		this(name, 500);
	}
	
	public Airplane(String name, int costPerHour){
		this(name, costPerHour, new Engine("Pratt and Whitney", "Kerosene"));
	}
	
	public Airplane(String name, int costPerHour, Engine engine){
		super(name);
		aName = name;
		aCostPerHour = costPerHour;
		aEngine = engine;
	}
	
	public Airplane(Airplane a)
	{
		this(a.getName(), 500, new Engine("Pratt and Whitney", "Kerosene"));
	}
	
	public int getCostPerHour()
	{
		return aCostPerHour;
	}
	
	@Override
	public String toString()
	{
		return "Airplane: Name: " + super.getName() + ", Engine: " + aEngine + ", cost per hour: " + aCostPerHour;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Airplane)) return false;
		else
		{
			Airplane a = (Airplane)other;
			return aName.equals(a.aName) && aEngine.equals(a.aEngine) && (aCostPerHour == a.aCostPerHour);
		}
	}

	@Override
	public int getTripCost(int miles){
		return (miles / AIRSPEED) * aCostPerHour;
	}
	
	final int AIRSPEED = 500;
	private String aName;
	private int aCostPerHour;
	private Engine aEngine;
	
}