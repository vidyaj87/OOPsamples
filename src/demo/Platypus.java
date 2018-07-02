package demo;

public class Platypus {
    String name;
    
    Platypus(String input) {
            name = input;
            System.out.println("Constructor One");
            System.out.println("Printing name :"+name);
    }
    Platypus() {
            this("John/Mary Doe");
            System.out.println("Constructor two");
    }
    public static void main(String args[]) {
            Platypus p1 = new Platypus("digger");
          Platypus p2 = new Platypus();
    }
}
