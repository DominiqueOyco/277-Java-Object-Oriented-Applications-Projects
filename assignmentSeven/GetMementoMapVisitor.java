package assignmentSeven;
//CECS 277 Assignment 7
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

import java.util.ArrayList;
import java.util.List;

public class GetMementoMapVisitor implements MapVisitor 
{
	public List<Memento> getMementos()
	{
		return mementos;
	}

	@Override
	public void visit(MyData me)
	{
		Memento m = new Memento(me);
		mementos.add(m);	
	}
	
	private List<Memento> mementos = new ArrayList<Memento>();
	
}