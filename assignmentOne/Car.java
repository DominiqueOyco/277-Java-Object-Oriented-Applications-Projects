//CECS 277 Assignment 1
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

package assignmentOne;

public class Car extends Vehicle {
	
	public Car(){
		this("No Name Car");
	}
	
	public Car(String name){
		this(name, 20);
	}
	
	public Car(String name, int milesPerGallon)
	{
		this(name, milesPerGallon, new Engine("Chevy", "Gas")); //Car has a engine (CONTAINMENT/AGGREGATION)
	}
	
	public Car(String name, int milesPerGallon, Engine engine)
	{
		this(name, milesPerGallon, engine, new Radio("Original")); //Car has a radio (CONTAINMENT/AGGREGATION)
	}
	
	public Car(String name, int milesPerGallon, Engine engine, Radio radio)
	{
		super(name);
		cName = name;
		cMilesPerGallon = milesPerGallon;
		cEngine = engine;
		cRadio = radio;
		toString();
	}
	
	public Car(Car c)
	{
		this(c.getName(), 20, new Engine("Chevy", "Gas"));
	}
	
	public int getMilesPerGallon()
	{
		return cMilesPerGallon;
	}
	
	public void setRadio(Radio radio) {
		this.cRadio = radio;
	}
	
	
	@Override
	public String toString()
	{
		return "Car: Name = " + super.getName() + ", Engine: " + cEngine + ", MPG = " + cMilesPerGallon + ", " + cRadio; 
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Car)) return false;
		else
		{
			Car c = (Car)other;
			if (cName.equals(c.cName) && (cMilesPerGallon == c.cMilesPerGallon))
			{
				return true;
			}
			return false;
		}
	}

	@Override
	public int getTripCost(int miles){
		return (miles / cMilesPerGallon) * COST_PER_GALLON;
	}
	
	final int COST_PER_GALLON = 3;
	private String cName;
	private int cMilesPerGallon;
	private Engine cEngine;
	private Radio cRadio;

}
