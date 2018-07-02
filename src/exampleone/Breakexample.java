package exampleone;

public class Breakexample {
		   public static void main(String[] args) {
		      int[] intary = { 99,12,22,34,45,67,5678,8990 };
		      int no = 5678;
		      int i = 0;
		      boolean found = false;
		      
		      for ( ; i < intary.length; i++) {
		    	  System.out.println(" Checked the number "+intary[i]);
		         if (intary[i] == no) {
		        	
		            found = true;
		            break;
		         }
		      }
		      if (found) {
		         System.out.println("Found the no: " + no + " at  index: " + i);
		      } else {
		         System.out.println(no + "not found  in the array");
		      }
		   }
}
