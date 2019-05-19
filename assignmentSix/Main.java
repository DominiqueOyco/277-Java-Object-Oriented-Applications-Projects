package assignmentSix;
//CECS 277 Assignment 6
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		//NO CHANGE!
		if(args.length != 1)
		{
			printUsage();
			System.exit(1);
		}
		
		List<String> input = null;
		try
		{
			input = getInput(args[0]);
		}
		catch(Throwable exp)
		{
			System.out.println("Received error: " + exp.getMessage() + " opening file: " + args[0]);
			System.exit(2);	
		}
		
		List<Shape> shapes = getShapes(input);
		
		for(Shape s : shapes)
		{
			System.out.println(s);;
		}
		
	}
	
	//NO CHANGE!
	private static List<String> getInput(String fileName) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File(fileName));
		List<String> input = new ArrayList<String>();
		
		while(sc.hasNextLine()) input.add(sc.nextLine());
		
		sc.close();
		
		return input;
	}
	
	//NO CHANGE!
	private static void printUsage()
	{
		System.out.println("Needs one argument: name of inout file");
	}
	
	//HAS TO CHANGE! EDIT IT!
	private static List<Shape> getShapes(List<String> input)
	{
		List<Shape> shapes = new ArrayList<Shape>();
		
		int circleRadius = 5;
		int squareSide = 1;
		for(String line : input)
		{	
			// Change the below line use your Singleton!!!!!!
			//SINGLETON - CONSTRUCTORS ARE PRIVATE!
			//HAVE TO USE A SINGLETON!
			ShouldBeSingleton s = new ShouldBeSingleton();
			// This next line is not to be changed
			int counter = s.getCounter();
			if(line.equals("Circle"))
			{
				Shape c = (Shape) new Circle(counter, circleRadius++);
				shapes.add(c);
			}
			
			else if(line.equals("Square"))
			{
				Shape sq = (Shape) new Square(counter, squareSide++);
				shapes.add(sq);
			}
			
			else
			{
				System.out.println("Error in input: " + line);
			}	
		}
		
		return shapes;
	}

}
