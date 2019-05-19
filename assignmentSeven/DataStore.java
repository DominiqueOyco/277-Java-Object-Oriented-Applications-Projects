package assignmentSeven;
//CECS 277 Assignment 7
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//USE THE ITERATOR FROM THE COLLECTION TO GET FULL CREDIT

public class DataStore implements VisitorAcceptor 
{	
	public DataStore(List<MyData> input)
	{
		for (int i = 0; i < input.size(); i++)
		{
			mData.put(input.get(i).getKey(), input.get(i));
		}		
	}
	
	@Override
	public void accept(MapVisitor visitor)
	{
		for (int i = 0; i < mData.size(); i++)
		{
			visitor.visit(mData.get("Key." + i));
		}
	}
	
	private Map<String, MyData> mData = new HashMap<String, MyData>();

}