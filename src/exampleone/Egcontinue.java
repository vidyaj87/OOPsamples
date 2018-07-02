package exampleone;

public class Egcontinue {

	   public static void main(String[] args) {
	      StringBuffer searchstr = new StringBuffer(
	         "hello how are you. ");
	      int length = searchstr.length();
	      int count = 0;
	      
	      for (int i = 0; i < length; i++) {
	    	  System.out.println("The character is "+searchstr.charAt(i));
	         if (searchstr.charAt(i) != 'h')continue;
	         count++;
	       //  System.out.println("value");
	        // searchstr.setCharAt(i, 'h');
	       //  System.out.println("value2" +i);
	      }
	      System.out.println("Found " + count + " h's in the string.");
	      System.out.println(searchstr);
	   }
	}