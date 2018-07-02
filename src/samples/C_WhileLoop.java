package samples;

public class C_WhileLoop
{
    // Prints values from 0 to 9
    public static void main( String[] args )
    {
        int loopLimit = 10;
        int count = 0;

        while ( count < loopLimit )
        {
            System.out.println( count );
            count = count + 1;// increase the count by one
        }
    }
    // TODO: Make the above program print values from 51 to 101
}
