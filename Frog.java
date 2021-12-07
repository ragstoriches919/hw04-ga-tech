package ga_tech;

public class Frog {

	private String name;
	private int age;
	private double tongueSpeed;
	private boolean isFroglet;
	protected String species = "Rare Pepe"; 
	
	Frog(String newName, int newAge, double newTongueSpeed){
		name = newName;
		age = newAge;
		tongueSpeed=newTongueSpeed;
		isFroglet = (age >=1 && age <7);
	}
	
	Frog(String newName, double ageInYears, double newTongueSpeed){
		name = newName;
		age = (int) ageInYears * 12;
		tongueSpeed=newTongueSpeed;
		isFroglet = (age >=1 && age <7);
	}
	
	Frog(String newName){
		name = newName;
		age = 5;
		tongueSpeed = 5;
		isFroglet = (age >=1 && age <7);
		
	}
	
//	Frog(){
//		age = 5;
//		tongueSpeed = 5;
//	}
	
	public void grow(int numMonths) {
		
		for (int i=0; i<numMonths; i++) {
			
			age ++;
			if (age <= 12){
				tongueSpeed ++;
			}
			else if (age >= 30 && tongueSpeed >5) {
				tongueSpeed --;
			}
			
		}
		if (age >= 1 && age < 7) {
			isFroglet = true;
		}
		else {
			isFroglet = false;
		}
	}
	
	public void grow() {
		age ++;
		
		if (age >= 1 && age < 7) {
			isFroglet = true;
		}
		else {
			isFroglet = false;
		}
		
	}
	
	
	public void eat(Fly aFly) {
		
		// Fly is dead!
		if (aFly.isDead()) {
//			System.out.println("fly is dead");
			return;
		}
		// Fly is caught!
		if (tongueSpeed > aFly.getSpeed()) {
			if (aFly.getMass() >= 0.5 *age ) {
				grow();
			}
			
			aFly.setMass(0);	
//			System.out.println("fly is caught");
		}
		
		// Fly escapes!
		else {
//			double newMass = aFly.getMass() + 1;
			aFly.setMass(aFly.getMass() + 1);
//			System.out.println("fly escaped");
		}
	}
	
	public String toString() {
		
		String returnString;
		
		if (isFroglet)
		{
			returnString = "My name is " + name + " and I知 a rare froglet! I知 " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
		}
		else {
			returnString = "My name is " + name + " and I知 a rare frog! I知 " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";	
		}
		
		return returnString;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String newSpecies) {
		species = newSpecies;
	}
	
	
}
