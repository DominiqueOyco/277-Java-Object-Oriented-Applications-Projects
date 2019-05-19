// CECS 277 Assignment 1
// Dominique Oyco - 014605758
// Jocelyn Espitia - 014101709

package assignmentOne;

public class Engine{

	public Engine() {
		this("Pratt and Whitney");
	}

	public Engine(String maker)
	{
		this(maker, "Gas"); //maker = Honda and fuel = Gas
	}
	
	public Engine(String maker, String fuel)
	{
		eMaker = maker; 
		eFuel = fuel;
	}
	
	public Engine(Engine e)
	{
		this(e.getMaker(), e.getFuel());
	}

	public String getMaker()
	{
		return eMaker;
	}
	
	public String getFuel()
	{
		return eFuel;
	}
	
	@Override
	public String toString()
	{
		return "Engine: Maker = " + eMaker + ", Fuel: " + eFuel;
	}
	
	public boolean equals(Object other)
	{
		if(!(other instanceof Engine)) return false;
		else
		{
			Engine e = (Engine)other;
			return eMaker.equals(e.eMaker) && eFuel.equals(e.eFuel);
		}
	}
	
	private String eMaker;
	private String eFuel;
}