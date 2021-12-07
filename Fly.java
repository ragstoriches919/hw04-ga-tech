package ga_tech;

public class Fly {

	private double mass;
	private double speed;
	
	Fly(double d_mass, double d_speed){
		
		mass = d_mass;
		speed = d_speed;
	}
	
	Fly(double d_mass){
		
		mass = d_mass;
		speed = 10.0;
		
	}
	
	Fly(){
		
		mass = 5.0;
		speed = 10.0;
	}
	
	public double getMass() {
		return mass;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setMass(double newMass) {
		
		if (newMass >= 0){
			mass=newMass;
		}
	}

	public void setSpeed(double newSpeed) {
		if (newSpeed >= 0){
			speed=newSpeed;
		}
	}
	
	public String toString() {
		
		String flyString;
		
		if (mass ==0){
			flyString = "I'm dead, but I used to be a fly with a speed of " + speed;
		}
		else {
			flyString = "I'm a speedy fly with " + speed + " speed and " + mass + " mass.";
		}
		
		return flyString;
		
	}
	
	public void grow(int addedMass) {
		mass = mass + addedMass;
		
		double over20 = (mass>20) ? mass-20: 0;
		double under20 = addedMass - over20;
		
		//Change speed

		speed = speed + (1 * under20);
		speed = speed - (0.5 * over20);
		
	}
	
	public boolean isDead() {
		return mass == 0;
	}
	
	
}
