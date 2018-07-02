package demo;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}

	
	public static void main(String args[])
	{
		Square sh = new Square();
		sh.draw();

	//	Shape sh1 = getShape(); //some third party logic to determine shape
	//	sh1.draw();
	}
}
