package assignmentTwo;
//CECS 277 Assignment 2
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class Airplane extends Vehicle{
	public Airplane()
	{
		this(new Manufacturer());
	}
	
	public Airplane(String manufacturer)
	{
		this(new Manufacturer(manufacturer));
	}
	
	public Airplane(Manufacturer manufacturer)
	{
		this(manufacturer, 500);
	}
	
	public Airplane(Manufacturer manufacturer, int costPerHour)
	{
		this(manufacturer, costPerHour, new Engine("Pratt and Whitney", "Kerosene"));
	}
	
	public Airplane(Manufacturer manufacturer, int costPerHour, Engine engine){
		super(manufacturer);
		aManufacturer = manufacturer;
		aCostPerHour = costPerHour;
		aEngine = engine;
	}
	
	public Airplane(Airplane a)
	{
		this(a.getManufacturer(), 500, new Engine("Pratt and Whitney", "Kerosene"));
	}
	
	public int getCostPerHour()
	{
		return aCostPerHour;
	}
	
	public void setManufacturer(Manufacturer manufacturer)
	{
		this.aManufacturer = manufacturer;
	}
	
	@Override
	public String toString()
	{
		return "Airplane: Name: " + super.getManufacturer() + ", Engine: " + aEngine + ", cost per hour: " + aCostPerHour;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Airplane)) return false;
		else
		{
			Airplane a = (Airplane)other;
			return aManufacturer.equals(a.aManufacturer) && aEngine.equals(a.aEngine) && (aCostPerHour == a.aCostPerHour);
		}
	}

	
	@Override
	public int getTripCost(int miles){
		return (miles / AIRSPEED) * aCostPerHour;
	}
	
	@Override
	public int compareTo(Object x) {
		if(!(x instanceof Airplane)) 
		{
			if(x instanceof Car) return -1; 
			else return 0; 
		}
		
		else{
			Airplane a = (Airplane)x;
			if(aCostPerHour > a.aCostPerHour){
				return 1;
			}
			else if(aCostPerHour < a.aCostPerHour){
				return -1;
			}
			else return 0;
		}
	}

	public int getCompareValue(){
		return aCostPerHour;
	}
	
	@Override
	public String read(){
		return "Reading: " + this.toString();
	}
	@Override
	public String write(){
		return "Writing: " + this.toString();
	}
	
	final int AIRSPEED = 500;
	private Manufacturer aManufacturer;
	private int aCostPerHour;
	private Engine aEngine;
	
}
