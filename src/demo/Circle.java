package demo;

public class Circle {

	public void draw(){
		System.out.println("Drwaing circle with default color Black and diameter 1 cm.");
	}
	
	public void draw(int diameter){
		System.out.println("Drwaing circle with default color Black and diameter"+diameter+" cm.");
	}
	
	public void draw(int diameter, String color){
		System.out.println("Drwaing circle with color "+color+" and diameter "+diameter+" cm.");
	}
	
	public static void main(String args[]) {
		
	    Circle c = new Circle();
	    	c.draw();
	    	c.draw(78);
	    	c.draw(44, "white");

	}
}