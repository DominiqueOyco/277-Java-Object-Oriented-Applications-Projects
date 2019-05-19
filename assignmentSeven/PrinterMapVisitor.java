package assignmentSeven;
//CECS 277 Assignment 7
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class PrinterMapVisitor implements MapVisitor 
{	
	@Override
	public void visit(MyData me)
	{
		System.out.println("Key = " + me.getKey() + ", value = " + me.getValue());
	}	
}
