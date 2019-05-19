package assignmentSix;
//CECS 277 Assignment 6
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public abstract class Shape 
{
	public Shape(int count)
	{
		mCount = count;
	}
	
	public String toString()
	{
		return "Count = " + mCount;
	}
	
	private int mCount;
}
