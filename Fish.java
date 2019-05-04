package polymorphism2;

public class Fish extends Animal {

	private int fins;

	public int getFins() {
		return fins;
	}
	public void setFins(int fins) {
		this.fins = fins;
	}
	
	@Override
	public void move() {
		
		System.out.println(super.getType() + " is swimming.");
		
	}
	
	@Override
	public String toString() {
		return "Fish [fins=" + fins + " " + "super.toString()]";
		
}
}
