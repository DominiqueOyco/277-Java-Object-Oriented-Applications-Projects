package assignmentSix;

//CECS 277 Assignment 6
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
import java.util.ArrayList;

public class ShapeComposite extends ShapeComponent 
{
	@Override
	public void draw()
	{
		System.out.println("I am a Composite containing:");
		for(ShapeComponent s : mList) s.draw();
	}
	
	public void add(ShapeComponent s)
	{
		mList.add(s);
	}
	
	private ArrayList<ShapeComponent> mList = new ArrayList<ShapeComponent>();
}
