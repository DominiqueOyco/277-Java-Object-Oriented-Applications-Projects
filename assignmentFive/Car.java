package assignmentFive;
//CECS 277 Assignment 5
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

import java.util.List;


public class Car {
	public Car(List<Item> items)
	{
		mItems = items;
	}
	
	public String toString()
	{
		String car = "Consists of: ";
		boolean firstTime = true;
		for(Item i : mItems)
		{
			if(!firstTime)
			{
				car += " ";
			}
			car += i;
			firstTime = false;
		}
		
		return car;
	}
	
	private List<Item> mItems;
}