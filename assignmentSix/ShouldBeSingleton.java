package assignmentSix;
//CECS 277 Assignment 6
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class ShouldBeSingleton 
{
	public ShouldBeSingleton()
	{
		mCounter = 1;
	}
	
	public int getCounter()
	{
		int value = mCounter++;
		
		return value;
	}
	
	private int mCounter;
	
}
