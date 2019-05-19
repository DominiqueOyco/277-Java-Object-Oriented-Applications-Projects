package assignmentFive;

//CECS 277 Assignment 5
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709
import java.util.ArrayList;
import java.util.List;

public abstract class CarBuilder {

	public abstract void addEngine();

	public abstract void addBody();

	public abstract void addSoundSystem();

	public abstract void addWheels();

	public final Car build() {
		return new Car(theItems);
	}
	
	public void addItem(Item item){
		theItems.add(item);
	}
	
	private List<Item> theItems = new ArrayList<Item>();

}