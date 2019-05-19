package assignmentTwo;
//CECS 277 Assignment 2
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class Car extends Vehicle {
	public Car(){
		this(new Manufacturer());
	}
	public Car(String manufacturer){
		this(new Manufacturer(manufacturer));
	}
	
	public Car(Manufacturer manufacturer)
	{
		this(manufacturer, 20);
	}
	
	public Car(Manufacturer manufacturer, int milesPerGallon){
		this(manufacturer, milesPerGallon, new Engine("Chevy", "Gas"));
	}
	
	public Car(Manufacturer manufacturer, int milesPerGallon, Engine engine)
	{
		this(manufacturer, milesPerGallon, engine, new Radio("Original"));
	}
	
	public Car(Manufacturer manufacturer, int milesPerGallon, Engine engine, Radio radio)
	{
		super(manufacturer);
		cManufacturer = manufacturer;
		cMilesPerGallon = milesPerGallon;
		cEngine = engine;
		cRadio = radio;
	}
	
	public Car(Car c)
	{
		this(c.getManufacturer(), 20, new Engine("Chevy", "Gas"));
	}
	
	public int getMilesPerGallon()
	{
		return cMilesPerGallon;
	}
	
	public void setRadio(Radio radio)
	{
		this.cRadio = radio;
	}
	
	public void setManufacturer(Manufacturer manufacturer)
	{
		this.cManufacturer = manufacturer;
	}
	
	@Override
	public String toString()
	{
		return "Car: Manufacturer = " + super.getManufacturer() + ", " + cEngine + ", MPG = " + cMilesPerGallon + ", " + cRadio; 
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof Car)) return false;
		else
		{
			Car c = (Car)o;
			if (cManufacturer.equals(c.cManufacturer) && (cMilesPerGallon == c.cMilesPerGallon))
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
	
	@Override
	public int compareTo(Object x) {
		if(!(x instanceof Car)) 
		{
			if(x instanceof Airplane) return -1; 
			else return 0; 
		}
		else{
			Car c = (Car)x;
			if(cMilesPerGallon > c.cMilesPerGallon){
				return 1;
			}
			else if(cMilesPerGallon < c.cMilesPerGallon){
				return -1;
			}
			else return 0;
		}
	}

	public int getCompareValue(){
		return cMilesPerGallon;
	}

	@Override
	public String read(){
		return "Reading: " + this.toString();
	}
	public String write(){
		return "Writing: " + this.toString();
	}
	
	final int COST_PER_GALLON = 3;
	private Manufacturer cManufacturer;
	private int cMilesPerGallon;
	private Engine cEngine;
	private Radio cRadio;

}
