package assignmentSeven;
//CECS 277 Assignment 7
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class Memento 
{	
	public Memento(MyData me)
	{
		mData = me;
	}
	
	public MyData getMementoData()
	{
		return mData;
	}
	
	private MyData mData;
}