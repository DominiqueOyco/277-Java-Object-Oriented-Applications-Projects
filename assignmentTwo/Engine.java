package assignmentTwo;
//CECS 277 Assignment 2
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class Engine implements Storable{

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
	
	public int compareTo(Object x) 
	{
		if(!(x instanceof Engine))
		{
			return -1; 
		}
		
		else
		{
			Engine e = (Engine)x;
			
			if(!eMaker.equals(e.eMaker)) return -1;
			else if(eMaker.equals(e.eMaker)) return 1;
			else
			{
				if(!eFuel.equals(e.eFuel)) return -1;
				else if(eFuel.equals(e.eFuel)) return 1;
				else return 0;
			}
		}
	}
	
	@Override
	public String read(){
		return "Read: " + this.toString();
	}
	
	@Override
	public String write(){
		return "Write: " + this.toString();
	}
	
	private String eMaker;
	private String eFuel;
}