package assignmentFour;
//CECS 277 Assignment 4
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class Rectangle extends Shape
{
	public Rectangle()
	{
		this(new Name());
	}
	
	public Rectangle(String name)
	{
		this(new Name(name));
	}
	
	public Rectangle(Name name)
	{
		this(name, 2);
	}
	
	public Rectangle(Name name, int length)
	{
		this(name, length, 2 * length);
	}
	
	public Rectangle(Name name, int length, int width)
	{
		this(name, length, width, new Point("corner"));
	}

	public Rectangle(Name name, int length, int width, Point corner)
	{
		super(name);
		mLength = length;
		mWidth = width;
		mCorner = corner;
	}
	
	public Rectangle(Rectangle r)
	{
		this(new Name("Copy of " + r.getName()), r.getLength(), r.getWidth(), new Point(r.getCorner()));
	}
	
	@Override
	public double getArea() 
	{
		return mLength * mWidth;
	}

	@Override
	public double getPerimeter() 
	{
		return 2 * mLength + 2 * mWidth;
	}
	
	@Override
	public double getDistance(Shape other)
	{
		if(!(other instanceof Rectangle))
		{
			String shape1 = "Rectangle";
			String shape2 = "";
			
			if(!(other instanceof Rectangle)) 
			{
				shape2 = other.getClass().getSimpleName();
				
				throw new InvalidDistanceComputationException("Cannot compare class " + shape1 + " with class " + shape2);
			}
		}
		else
		{
			Rectangle r = (Rectangle)other;
			return mCorner.getDistance(r.mCorner);
		}
		return 0.0;
	}
	
	@Override
	public String toString()
	{
		return "Rectangle: " + super.toString() + ", Corner: " + mCorner + ", Length: " + mLength + ", Width: " + mWidth;
	}
	
	@Override
	public boolean equals(Object other)
	{
		String shape1 = "Rectangle";
		String shape2 = "";
		
		if(!(other instanceof Rectangle)) 
		{
			shape2 = other.getClass().getSimpleName();
					
			throw new InvalidComparisonException("Cannot compare class " + shape1 + " with class " + shape2);
		}
		
		else
		{
			Rectangle c = (Rectangle)other;
			return super.equals(c) && mWidth == c.mWidth && mLength == c.mLength;
		}
	}
	
	@Override
	public int compareTo(Object other) 
	{
		if(!(other instanceof Rectangle)) 
		{
			if(other instanceof Point) return 1; 
			else return 0; 
		}
		
		else
		{
			Rectangle r = (Rectangle)other;
			
			int answer = mCorner.compareTo(r.mCorner);
			if(answer != 0) return answer;
			
			if(mLength < r.mLength) return -1;
			else if(mLength == r.mLength)return 0;
			else
			{
				if(mWidth < r.mWidth)return -1;
				else if(mWidth == r.mWidth)return 0;
				else return 1;
			}			
		}
	}

	@Override
	public String scale(int scaleFactor) {
		mLength = mLength * scaleFactor;
		mWidth = mWidth * scaleFactor;
		Rectangle r = new Rectangle(new Name(getName()), mWidth, mLength, mCorner);
		
		return r.toString();
	}
	
	public Point getCorner()
	{
		return mCorner;
	}
	
	public int getLength()
	{
		return mLength;
	}
	
	public int getWidth()
	{
		return mWidth;
	}
	
	private Point mCorner;
	private int mLength;
	private int mWidth;
}