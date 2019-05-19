package assignmentFour;
//CECS 277 Assignment 4
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class Square extends Shape
{
	public Square()
	{
		this("NoNameSquare");
	}
	
	public Square(String name)
	{
		this(new Name(name));
	}
	
	public Square(Name name)
	{
		this(name, 3);
	}
	
	public Square(Name name, int side)
	{
		this(name, side, new Point("corner"));
	}
	
	public Square(Name name, int side, Point corner)
	{
		super(name);
		mSide = side;
		mRectangle = new Rectangle(name, side, side, corner);
	}

	@Override
	public double getArea()
	{
		return mRectangle.getArea();		
	}
	
	@Override
	public double getPerimeter() {
		return mRectangle.getPerimeter();
	}

	@Override
	public String toString()
	{
		return "Square: " + super.toString() + ", Side: " + getSide(); 
	}
	
	@Override
	public double getDistance(Shape other)
	{
		if(!(other instanceof Square))
		{
			String shape1 = "Square";
			String shape2 = "";
			
			if(!(other instanceof Square)) 
			{
				shape2 = other.getClass().getSimpleName();
				
				throw new InvalidDistanceComputationException("Cannot compare class " + shape1 + " with class " + shape2);
			}
		}
		else
		{
			Square s = (Square)other;
			return mRectangle.getCorner().getDistance(s.getCorner());
		}
		return 0.0;
	}
	

	@Override
	public boolean equals(Object other)
	{
		String shape1 = "Square";
		String shape2 = "";
		
		if(!(other instanceof Square)) 
		{
			shape2 = other.getClass().getSimpleName();
					
			throw new InvalidComparisonException("Cannot compare class " + shape1 + " with class " + shape2);
		}
		
		else
		{
			Square s = (Square)other;
			return super.equals(s) && mRectangle.getWidth() == s.mRectangle.getWidth() 
					&& mRectangle.getWidth() == s.mRectangle.getLength();
		}
	}

	
	@Override
	public int compareTo(Object arg0) {
		if(!(arg0 instanceof Rectangle)) 
		{
			if(arg0 instanceof Point) return 1; 
			else return 0; 
		}
		
		else
		{
			Rectangle r = (Rectangle)arg0;
			
			int answer = mRectangle.getCorner().compareTo(r.getCorner());
			if(answer != 0) return answer;
			
			if(mRectangle.getLength() < r.getLength()) return -1;
			else if(mRectangle.getLength() == r.getLength())return 0;
			else
			{
				if(mRectangle.getWidth() < r.getWidth())return -1;
				else if(mRectangle.getWidth() == r.getWidth())return 0;
				else return 1;
			}			
		}
	}

	@Override
	public String scale(int scaleFactor)
	{
		mSide = mSide * scaleFactor;
		Square sq = new Square(new Name(getName()), mSide, mRectangle.getCorner());
		
		return sq.toString();
	}
	
	public int getSide()
	{
		return mSide;
	}
	
	public Point getCorner()
	{
		return mRectangle.getCorner();
	}
	
	private Rectangle mRectangle;
	private int mSide;

}