package polymorphism2;

import java.util.List;

public class MovementService {
	
/*
	  public void makeItMove(Animal animal){
	  
	  animal.move();
	 
	  }
*/	
	// go through each element in the array 
	public void makeItMove(List<Animal> animals) {
		
		for(Animal a : animals) {
		a.move();
		// we need to check the element becomes fish using #instanceof
		if (a instanceof Fish) {
		System.out.println("Fins: " +((Fish)a).getFins());
		}
	}

}
}