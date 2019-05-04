package polymorphism2;

public abstract class Animal {
	
	private String color;
	private String eyes;
	private String type;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void eat(){
		System.out.println("Animal is eating.");
	}

	//public abstract void move();

	public void sleep(){
		System.out.println(type + " is sleeping.");
	}
	
	public void move(){
		System.out.println("I am moving.");
	}
	
	@Override
	public String toString() {
		return "eyes=" + eyes + ", type=" + type + ", color=" + color;
	}

	
	public static void runStaticMethod() {
		
		System.out.println("This is an example of my static method.");
		
	}



}
