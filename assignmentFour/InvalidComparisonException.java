package assignmentFour;
//CECS 277 Assignment 4
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
public class InvalidComparisonException extends RuntimeException
{
	public InvalidComparisonException(String message)
	{
		super(message);
	}
	
	@Override
	public String toString()
	{
		return this.getMessage(); //(= super(message)
	}
}
