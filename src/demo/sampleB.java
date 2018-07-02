package demo;

public class sampleB extends sampleA{
sampleB()
{
	System.out.println("Inside constructor of sampleB");
}
void getinfo()
{
	System.out.println("Overriding function");
	//super.getinfo();
}
public static void main(String args[]) {
	
    sampleB p1 = new sampleB();
    	p1.getinfo();

}
}