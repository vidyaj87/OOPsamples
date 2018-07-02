 package samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_ConditionIFCheckSpecialCharacters
{
    /**
     * @param args
     * @throws IOException
     */
    /**
     * @param args
     * @throws IOException
     */
    public static void main( String[] args ) throws IOException
    {
    	System.out.print( "Enter text  ");
        InputStreamReader iStream = new InputStreamReader( System.in );
        BufferedReader bReader = new BufferedReader( iStream );
        String inputText = bReader.readLine();

        System.out.print( "Input text is : '" );
        System.out.print( inputText );
        System.out.println( "'" );

        boolean hasATcharacter = false;

        hasATcharacter = inputText.contains( "@" );

        if ( hasATcharacter )
        {
            System.out.println( "Text has @ character" );
        }

        // Another Method

        if ( inputText.contains( "#" ) )
        {
            System.out.println( "Text has # character" );
        }

        // Yet Another Method
        if ( inputText.contains( "$" ) || inputText.contains( "%" ) || inputText.contains( "&" ) )
        {
            System.out.println( "Text has a special character '$' or '%' or '&'" );
        }

    }
}
