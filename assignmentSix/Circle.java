package assignmentSix;
//CECS 277 Assignment 6
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class Circle extends Shape 
{
	public Circle(int counter, int radius)
	{
		super(counter);
		mRadius = radius;
	}
	
	public String toString()
	{
		return "Circle: " + super.toString() + ", Radius = " + mRadius;
	}
	
	private int mRadius;

}
