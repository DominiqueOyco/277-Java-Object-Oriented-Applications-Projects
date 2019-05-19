package assignmentTwo;
// CECS 277 Assignment 2
// Dominique Oyco - 014605758
// Jocelyn Espitia - 014101709

public class Manufacturer{
	
	public Manufacturer()
	{
		this("Amazon");
	}
	
	public Manufacturer(String manufacturer)
	{
		setManufacturer(manufacturer);
	}
	
	public void setManufacturer(String manufacturer)
	{
		mManufacturer = manufacturer;
	}
	
	public Manufacturer(Manufacturer manufacturer)
	{
		this(manufacturer.getManufacturer());
	}
	
	
	
	public String getManufacturer()
	{
		return mManufacturer;
		
	}
	
	@Override
	public String toString()
	{
		return "Manufacturer = " + mManufacturer;
	}
	
	
	
	private String mManufacturer;
}