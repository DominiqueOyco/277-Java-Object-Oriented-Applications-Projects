package assignmentSeven;
//CECS 277 Assignment 7
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

import java.util.ArrayList;
import java.util.List;

public class RestoreMementoMapVisitor implements MapVisitor 
{	
	public RestoreMementoMapVisitor(List<Memento> mementos)
	{
		this.rMementos = mementos;
	}

	@Override
	public void visit(MyData me)
	{
		for (int i = 0; i < rMementos.size(); i++)
		{
			me.setData(rMementos.get(i).getMementoData());
		}		
	}	
	
	private List<Memento> rMementos = new ArrayList<Memento>();
	
}
