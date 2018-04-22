package zakharchuk;

public class Main {

	public static void main(String... strings) {
		Dog dogge = new Dog();
		Bird birdee = new Bird();
		System.out.println(dogge.tryToFly());
		System.out.println(birdee.tryToFly());
		
		dogge.setFlyingAbility(new ItFlys());
		System.out.println(dogge.tryToFly());
		
		Elephant elphy = new Elephant();
		System.out.println(elphy.tryToFly());
	}
	
}
