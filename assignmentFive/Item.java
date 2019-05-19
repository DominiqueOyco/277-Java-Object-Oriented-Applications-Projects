package assignmentFive;
//CECS 277 Assignment 5
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class Item {
	
	
	public Item(String name){
		mName = name;
	}

	@Override
	public String toString()
	{
		return "\n" +mName;
	}
	
	
	
	private String mName;
}