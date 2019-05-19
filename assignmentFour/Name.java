package assignmentFour;
//CECS 277 Assignment 4
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class Name 
{
	public Name()
	{
		this("NoName");
	}
	
	public Name(Name name)
	{
		this(name.getName());
	}
	
	public Name(String name)
	{
		setName(name);
	}
	
	public String getName()
	{
		return mName;
	}
	
	public void setName(String name)
	{
		mName = name;
	}
	
	private String mName;
}
