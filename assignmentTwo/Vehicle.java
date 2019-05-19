package assignmentTwo;
//CECS 277 Assignment 2
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709


public abstract class Vehicle implements Comparable<Object>, Storable
{ 
	public Vehicle()
	{
		this(new Manufacturer());
	}
	
	public Vehicle(String manufacturer){
		this(new Manufacturer(manufacturer));
	}
	
	public Vehicle(Manufacturer manufacturer)
	{
		this(manufacturer, new Engine("GE", "Gas"));
	}
	
	public Vehicle(Manufacturer manufacturer, Engine engine)
	{
		mManufacturer = manufacturer;
		mEngine = engine;
	}

	public Manufacturer getManufacturer()
	{
		return mManufacturer;
	}
	
	public Engine getEngine()
	{
		return mEngine ;
	}
	
	@Override
	public String toString()
	{
		return "Manufacturer = " + mManufacturer + ", " + mEngine;
	}
	
	
	public boolean equals(Object o){
		if(!(o instanceof Vehicle)) return false;
		else{
			Vehicle v = (Vehicle)o;
			return mManufacturer.equals(v.mManufacturer);
		}
	}
	public abstract int getTripCost(int miles);
	
	public abstract int getCompareValue();
	
	public int getCompareValue(Car car, Airplane airplane){
		return car.compareTo(airplane);
	}
	
	private Manufacturer mManufacturer;
	private Engine mEngine;
	
}
