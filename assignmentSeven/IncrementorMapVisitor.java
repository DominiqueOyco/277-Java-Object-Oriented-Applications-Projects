package assignmentSeven;
//CECS 277 Assignment 7
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class IncrementorMapVisitor implements MapVisitor 
{	
	public IncrementorMapVisitor(int i)
	{
		mIncrementor = i;
	}

	@Override
	public void visit(MyData me)
	{
		me.setValue(me.getKey(), mIncrementor);
		mIncrementor++;
	}
	
	private int mIncrementor;
}