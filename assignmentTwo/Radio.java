package assignmentTwo;
//CECS 277 Assignment 2
//Dominique Oyco - 014605758
//Jocelyn Espitia - 014101709


public class Radio {
	
	public Radio(){
		this("Original");
	}
	
	public Radio(String radio){
		rRadio = radio;
	}
	
	public String getRadio(){
		return rRadio;
		
	}
	
	public String toString(){
		return "Radio: " + rRadio;
	}
	
	private String rRadio;

}
