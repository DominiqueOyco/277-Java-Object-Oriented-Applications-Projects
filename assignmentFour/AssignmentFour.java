package assignmentFour;
import java.util.ArrayList;
import java.util.List;


public class AssignmentFour
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();	
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Square s1 = new Square();
		
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(c1);
		shapes.add(r1);
		shapes.add(s1);
		
		for(Shape s : shapes)
		{
			sop("\n" + s);
			sop("Name: " + s.getName());
			sop("Area: " + s.getArea());
			sop("Perimeter: " + s.getPerimeter());
		}
		
		sop("");
		try
		{
			sop("p1 == p1 " + p1.equals(p1));
			sop("p1 == c1 " + p1.equals(c1));
		}
		catch(InvalidComparisonException ex)
		{
			sop("Error: " + ex.toString());
		}
		
		try
		{
			sop("c1 == c1 " + c1.equals(c1));
			sop("c1 == r1 " + c1.equals(r1));
		}
		catch(InvalidComparisonException ex)
		{
			sop("Error: " + ex.toString());
		}
		
		try
		{
			sop("r1 == r1 " + r1.equals(r1));
			sop("r1 == s1 " + r1.equals(s1));
		}
		catch(InvalidComparisonException ex)
		{
			sop("Error: " + ex.toString());
		}
		
		try
		{
			sop("s1 == s1 " + s1.equals(s1));
			sop("s1 == p1 " + s1.equals(p1));
		}
		catch(InvalidComparisonException ex)
		{
			sop("Error: " + ex.toString());
		}
		
		sop("");
		try
		{
			sop("Distance p1 to p1: " + p1.getDistance(p1));
			sop("Distance p1 to c1: " + p1.getDistance(c1));
		}
		catch(InvalidDistanceComputationException e)
		{
			sop("Error: " + e.toString());
		}
		
		try
		{
			sop("Distance c1 to c1: " + c1.getDistance(c1));
			sop("Distance c1 to r1: " + c1.getDistance(r1));
		}
		catch(InvalidDistanceComputationException e)
		{
			sop("Error: " + e.toString());
		}
		
		try
		{
			sop("Distance r1 to r1: " + r1.getDistance(r1));
			sop("Distance r1 to s1: " + r1.getDistance(s1));
		}
		catch(InvalidDistanceComputationException e)
		{
			sop("Error: " + e.toString());
		}
		
		try
		{
			sop("Distance s1 to s1: " + s1.getDistance(s1));
			sop("Distance s1 to p1: " + s1.getDistance(p1));
		}
		catch(InvalidDistanceComputationException e)
		{
			sop("Error: " + e.toString());
		}
		// Use Scalable Interface
		doScale(p1, 2);
		doScale(c1, 6);
		doScale(r1, 7);
		doScale(s1,12);
	}

	static private void doScale(Shape s, int scale)
	{
		sop("");
		sop("Original: " + s);
		s.scale(scale);
		sop("Scale by " + scale + ": " + s);
	}
	
	static private void sop(String s)
	{
		System.out.println(s);
	}
}
