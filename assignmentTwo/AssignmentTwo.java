package assignmentTwo;
import java.util.ArrayList;
import java.util.Collections;


public class AssignmentTwo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Manufacturer m1 = new Manufacturer("Boeing");
		Manufacturer m2 = new Manufacturer("Cessna");
		Manufacturer m3 = new Manufacturer("Airbus");
		
		Airplane a1 = new Airplane();
		Airplane a2 = new Airplane(m1, 700);
		Airplane a3 = new Airplane(m2, 1000);
		Airplane a4 = new Airplane(m2, 200, new Engine("GE", "kerosine"));
		Airplane a5 = new Airplane(a1);
		
		a5.setManufacturer(m3);
		
		Manufacturer m5 = new Manufacturer("Ford");
		Manufacturer m6 = new Manufacturer("Honda");
		Manufacturer m7 = new Manufacturer("Chevy");
		
		Car c1 = new Car();
		Car c2 = new Car(m5, 30);
		Car c3 = new Car(m6, 100);
		Car c4 = new Car(m7, 200, new Engine("Ford", "Gas"));
		Car c5 = new Car(c1);
		Radio r1 = new Radio("Upgraded Radio");
		c1.setRadio(r1);
		c5.setManufacturer(m7);
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
		vehicles.add(a1); 
		vehicles.add(a2); 
		vehicles.add(a3); 
		vehicles.add(a4);
		vehicles.add(a5);
		vehicles.add(c1); 
		vehicles.add(c2); 
		vehicles.add(c3); 
		vehicles.add(c4);
		vehicles.add(c5); 
				
		sop("=======================================================");
		for(Vehicle v : vehicles)
		{
			sop("" + v);
		}
		
		// Exercise Comparable
		sop("\n=======================================================");
		sop("Vehicles Unsorted");
		for(Vehicle v : vehicles)
		{
			sop(v + " compared by [" + v.getCompareValue() + "]");
		}
	
		
		sop("\nVehicles Sorted");
		Collections.sort(vehicles);;
		for(Vehicle v : vehicles)
		{
			sop(v + " compared by [" + v.getCompareValue() + "]");	
		}
		
		ArrayList<Engine> engines = new ArrayList<Engine>();
		engines.add(new Engine("A", "B"));
		engines.add(new Engine("C", "D"));
		engines.add(new Engine("E", "F"));
	
		// Exercise Storable
		sop("\n=======================================================");
		boolean b = true;
		for(Vehicle v : vehicles)
		{
			if(b)
			{
				load(v);
			} 
			else
			{
				save(v);
			}
			b = !b;		
		}
		
		for(Engine e : engines) save(e);
	}

	static private void load(Storable s)
	{
		sop(s.read());	
	}
	
	static private void save(Storable s)
	{
		sop(s.write());	
	}
	
	static private void sop(String s)
	{
		System.out.println(s);
	}
}
