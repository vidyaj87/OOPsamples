package samples;

public class A_ConditionIF
{
    public static void main( String[] args )
    {
        // SECTION A
        int number = 0;

        if ( number == 0 )
        {
            System.out.println( "Zero" );
        }
        else
        {
            System.out.println( "NON - Zero" );
        }

        // SECTION B
        int score = 899;
        if ( score < 100 )
        {
            System.out.println( "Score Short of Century." );
        }
        else if ( score == 100 )
        {
            System.out.println( "Century." );
        }
        else
        {
            System.out.println( "Crossed Century" );
        }

    }
}
