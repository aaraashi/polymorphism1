package polymorphism2;

public class Bird extends Animal {

	private int legs;
	private int wings;

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	
	@Override
	public void move() {
		
		System.out.println(super.getType() + " is flying.");
	}
	
	@Override
	public String toString() {
		return "Bird " + super.toString() + " , wings=" + wings;
	}
}
