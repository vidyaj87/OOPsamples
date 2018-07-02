package samples;

public class F_SumofTenNumbersUsingForLoop
{
    public static void main( String[] args )
    {
        int loopLimit = 10;
        int sum = 0;

        for ( int i = 0; i <= loopLimit; i++ )
        {
            sum = sum + i;
        }

        // after the loop print the value
        System.out.println( "The sum is : " + sum );
    }

}
