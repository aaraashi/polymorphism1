package polymorphism2;

import java.util.List;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		//ArrayList<Animal> animals = new ArrayList<Animal>();
		//better way to make an array list
		List<Animal> animals = new ArrayList<>();
		
		
		Dog dog = new Dog();
		dog.setLegs(4);
		dog.setType("lab");
		animals.add(dog);
		dog.setType("Sheppard");
		System.out.println(dog.getType());
		System.out.println(animals.get(0).getType()); //the variable has been changed so it is "Sheppard".
		
		Fish fish = new Fish();
		fish.setType("Shark");
		animals.add(fish);
		// after adding the array element, set fins number
		fish.setFins(7);
		System.out.println(animals.get(0).getType());
		System.out.println(animals.get(1).getType());
		
		Bird bird = new Bird();
		bird.setType("Crow");
		animals.add(bird);
		
		MovementService ms = new MovementService();

		//ms.makeItMove(dog);
		//ms.makeItMove(fish);
		//ms.makeItMove(bird);
		ms.makeItMove(animals);

	}

}
