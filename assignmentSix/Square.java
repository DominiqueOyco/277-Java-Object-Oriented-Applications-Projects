package assignmentSix;
//CECS 277 Assignment 6
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class Square extends Shape 
{
	public Square(int counter, int side)
	{
		super(counter);
		mSide = side;
	}
	
	public String toString()
	{
		return "Square: " + super.toString() + ", Side = " + mSide;
	}
	
	private int mSide;
}
