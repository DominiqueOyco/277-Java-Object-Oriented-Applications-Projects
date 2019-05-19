package assignmentFour;

//CECS 277 Assignment 4
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public abstract class Shape implements Comparable<Object>, Scalable
{
	public Shape(String name)
	{
		mName = new Name(name);
	}
	
	public Shape(Name name)
	{
		mName = new Name(name);
	}
	
	public String getName()
	{
		return mName.getName();
	}
	
	public void setName(String name)
	{
		mName = new Name(name);
	}
	
	@Override
	public String toString()
	{
		return "Name = " + getName();
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof Shape)) return false;
		else
		{
			Shape s = (Shape)o;			
			return getName().equals(s.getName());
		}
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public abstract double getDistance(Shape other);
	
	private Name mName;
}
