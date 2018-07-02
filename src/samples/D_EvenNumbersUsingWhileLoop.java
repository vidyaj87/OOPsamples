package samples;

public class D_EvenNumbersUsingWhileLoop
{
    public static void main( String[] args )
    {
        int loopLimit = 100;
        int count = 0;

        while ( count < loopLimit )
        {
            if ( count % 2 == 0 )// check if the "count" is completely divisible by 2
            {
                System.out.println( count );
            }
            count++;// count= count+1
        }
    }
    // TODO:Print all the multiple of 7 between 30 and 300
}
