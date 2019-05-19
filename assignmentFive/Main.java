package assignmentFive;

public class Main 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		CarBuilder vanBuilder = new VanBuilder();
		vanBuilder.addEngine();
		vanBuilder.addBody();
		vanBuilder.addSoundSystem();
		vanBuilder.addWheels();
		
		System.out.println("Here's your family van:\n");
		Car van = vanBuilder.build();
		System.out.println(van);

		CarBuilder raceCarBuilder = new RaceCarBuilder();
		raceCarBuilder.addEngine();
		raceCarBuilder.addBody();
		raceCarBuilder.addSoundSystem();
		raceCarBuilder.addWheels();
		
		System.out.println("\nHere's your race car:\n");
		Car raceCar = raceCarBuilder.build();
		System.out.println(raceCar);
		
		CarBuilder electricCarBuilder = new ElectricCarBuilder();
		electricCarBuilder.addEngine();
		electricCarBuilder.addBody();
		electricCarBuilder.addSoundSystem();
		electricCarBuilder.addWheels();
		
		System.out.println("\nHere's your electric car:\n");
		Car electricCar = electricCarBuilder.build();
		System.out.println(electricCar);

	}

}