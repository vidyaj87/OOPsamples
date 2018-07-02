package samples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class I_FileReading
{
    public static void main( String[] args ) throws IOException
    {
        String myFile = "/home/abu/Desktop/1.txt";
        FileReader myFileReader = new FileReader( myFile );
        BufferedReader myFileBuffer = new BufferedReader( myFileReader );

        String text = myFileBuffer.readLine();
        while ( text != null )
        {
            System.out.println( text );
            text = myFileBuffer.readLine();// read the next line
        }
        myFileReader.close();
    }
}
