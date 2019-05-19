package assignmentFive;
//CECS 277 Assignment 5
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709

public class VanBuilder extends CarBuilder {

	@Override
	public void addEngine(){
		addItem(new Item("Engine: 6 Cylinder 200 Horsepower"));
	}
	
	@Override
	public void addBody(){
		addItem(new Item("Body: Multiple side and Back Doors"));
		
	}
	
	@Override
	public void addSoundSystem(){
		addItem(new Item("Sound: DVD Player For Kids in Back"));

	}
	
	@Override
	public void addWheels(){
		addItem(new Item("Wheels: Super Safe High Friction"));

		
	}
}