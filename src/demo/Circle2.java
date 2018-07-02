package demo;

public class Circle2 implements Shape{

	@Override
	public void draw(){
		System.out.println("Drwaing circle");
	}
public static void main(String args[]) {
		
	    Circle2 c = new Circle2();
	    	c.draw();
	    	//c.draw(78);
	    	//c.draw(44, "white");

	}
}