package assignmentSeven;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		List<MyData> input = getInput();
		
		DataStore datastore = new DataStore(input);
		
		MapVisitor printer = new PrinterMapVisitor();
		System.out.println("Before Increment");
		datastore.accept(printer);
		
		MapVisitor generateMemento = new GetMementoMapVisitor();
		datastore.accept(generateMemento);
		List<Memento> mementos = ((GetMementoMapVisitor)generateMemento).getMementos();
		
		MapVisitor incrementor = new IncrementorMapVisitor(5);
		datastore.accept(incrementor);
		
		System.out.println("\nAfter Increment");
		datastore.accept(printer);
		
		MapVisitor restoreMemento = new RestoreMementoMapVisitor(mementos);
		datastore.accept(restoreMemento);
		
		System.out.println("\nAfter Memento Restore");
		datastore.accept(printer);
	}
	
	private static List<MyData> getInput()
	{
		List<MyData> input = new ArrayList<MyData>();
		
		for(int ii = 0; ii < 5; ++ii)
		{
			MyData data = new MyData("Key." + String.valueOf(ii), ii);
			input.add(data);
		}
		
		return input;
	}

}
