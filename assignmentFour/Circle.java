package assignmentFour;
//CECS 277 Assignment 4
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class Circle extends Shape implements Scalable
{
	public Circle()
	{
		this("NoName");
	}
	
	public Circle(String name)
	{
		this(new Name(name));
	}
	
	public Circle(Name name)
	{
		this(name, new Point("center"));
	}
	
	
	public Circle(Name name, Point center)
	{
		this(name, center, 1.0);
	}
	
	public Circle(Name name, Point center, double radius)
	{
		super(name);
		mCenter = center;
		mRadius = radius;
		
	}
	
	public Circle(Circle c)
	{
		this(new Name("Copy of " + c.getName()), new Point(c.getCenter()), c.getRadius());
	}
	
	@Override
	public double getArea() 
	{
		return PI * mRadius * mRadius;
	}

	@Override
	public double getPerimeter() 
	{
		return 2 * PI * mRadius;
	}
	
	@Override
	public double getDistance(Shape other)
	{
		if(!(other instanceof Circle))
		{
			String shape1 = "Circle";
			String shape2 = "";
			
			if(!(other instanceof Circle)) 
			{
				shape2 = other.getClass().getSimpleName();
				
				throw new InvalidDistanceComputationException("Cannot compare class " + shape1 + " with class " + shape2);
			}
		}
		else
		{
			Circle c = (Circle)other;
			return mCenter.getDistance(c.mCenter);
		}
		return 0.0;
	}
	
	@Override
	public String toString()
	{
		return "Circle: " + super.toString() + ", Center: " + mCenter + ", Radius: " + mRadius;
	}
	
	@Override 
	public boolean equals(Object other)
	{
		String shape1 = "Circle";
		String shape2 = "";
		
		if(!(other instanceof Circle)) 
		{
			shape2 = other.getClass().getSimpleName();
			
			throw new InvalidComparisonException("Cannot compare class " + shape1 + " with class " + shape2);
		}
		else
		{
			Circle c = (Circle)other;
			return super.equals(c) && mCenter.equals(c.mCenter) && mRadius == c.mRadius;
		}
	}
	
	@Override
	public int compareTo(Object arg0) 
	{
		if(!(arg0 instanceof Circle)) 
		{
			if(arg0 instanceof Point) return 1; 
			else return 0; 
		}
		
		else
		{
			Circle c = (Circle)arg0;
			
			int answer = mCenter.compareTo(c.mCenter);
			if(answer != 0) return answer;
			
			if(mRadius < c.mRadius) return -1;
			else if(mRadius == c.mRadius)return 0;
			else return 1;
		}
	}
		
	@Override
	public String scale(int scaleFactor)
	{
		mRadius = mRadius * scaleFactor;
		Circle c = new Circle(new Name(getName()), mCenter, mRadius);
		
		return c.toString();
	}
	
	public Point getCenter()
	{
		return mCenter;
	}
	
	public double getRadius()
	{
		return mRadius;
	}
	
	private Point mCenter;
	private double mRadius;
	
	private static final double PI = 3.14159;

}
