package assignmentFour;

//CECS 277 Assignment 4
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class Point extends Shape
{
	public Point()
	{
		this("NoName");
	}
	
	public Point(String name){
		this(name, 0, 0);
		
	}
	
	public Point(Point p){
		this(p.getName(), p.getX(), p.getY());
	}
	
	public Point(String name, int x, int y){
		super(name);
		mX = x;
		mY = y;
	}
	
	@Override
	public double getArea()
	{
		return 0.0;
	}
	
	@Override
	public double getPerimeter()
	{
		return 0.0;
	}
	
	
	@Override
	public double getDistance(Shape other)
	{
		if(!(other instanceof Point))
		{
			String shape1 = "Point";
			String shape2 = "";
			
			if(!(other instanceof Point)) 
			{
				shape2 = other.getClass().getSimpleName();
				
				throw new InvalidDistanceComputationException("Cannot compare class " + shape1 + " with class " + shape2);
			}
		}
		
		else
		{
			Point p = (Point)other;
			return Math.sqrt(	((mX - p.mX) * (mX - p.mX)) +
								((mY - p.mY) * (mY - p.mY)) );
		}
		return 0.0;
	}
	
	public int getX()
	{
		return mX;
	}
	
	public int getY()
	{
		return mY;
	}
	
	@Override
	public String toString()
	{
		return "Point: " + super.toString() + ", (" + mX + "," + mY + ")";
	}
	
	@Override
	public boolean equals(Object other)
	{	
		String shape1 = "Point";
		String shape2 = "";
		
		if(!(other instanceof Point)) 
		{
			shape2 = other.getClass().getSimpleName();
			
			throw new InvalidComparisonException("Cannot compare class " + shape1 + " with class " + shape2);
		}
		else
		{
			Point p = (Point)other;
			return super.equals(p) && mX == p.mX && mY == p.mY;
		}
	}
		
	
	@Override
	public int compareTo(Object arg0) 
	{
		if(!(arg0 instanceof Point))
		{
			return -1; // Point is least
		}
		else
		{
			Point p = (Point)arg0;
			
			if(mX < p.mX) return -1;
			else if(mX > p.mX) return 1;
			else
			{
				if(mY < p.mY) return -1;
				else if(mY > p.mY) return 1;
				else return 0;
			}
		}
	}
	
	
	@Override
	public String scale(int scaleFactor) 
	{
		mX = mX + scaleFactor;
		mY = mY + scaleFactor;
		Point p = new Point(getName(), mX, mY);
		
		return p.toString();
	}
	
	private int mX;
	private int mY;
}
