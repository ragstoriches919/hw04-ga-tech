package ga_tech;

public class Pond {

	public static void main(String[] args) {
		
		Frog Peepo = new Frog("Peepo");
		Frog Pepe = new Frog("Pepe", 10, 15);
		Frog Peepaw = new Frog("Peepaw", 4.6, 5);
		Frog FrogOfMyLiking = new Frog("Frogdo");
		
		Fly FlySmall = new Fly(1 , 3);
		Fly FlyFatty = new Fly(6);
		Fly FlyOfMyLiking = new Fly(5,5);
		
		//1
		Peepo.setSpecies("1331 Frogs");
		
		//2
		System.out.println(Peepo);
		
		//3
		Peepo.eat(FlyFatty);
		
		//4
		System.out.println(FlyFatty);
		
		//5
		Peepo.grow(8);
		
		//6
		Peepo.eat(FlyFatty);
		
		//7
		System.out.println(FlyFatty);
		
		//8
		System.out.println(Peepo);
		
		//9
		System.out.println(FrogOfMyLiking);
		
		//10
		Peepaw.grow(4);
		
		//11
		System.out.println(Peepaw);
		
		//12
		System.out.println(Pepe);
		
	}
	
}
