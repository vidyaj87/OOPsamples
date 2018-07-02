package samples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class H_FileCreation
{
    public static void main( String[] args ) throws IOException
    {
        String myFilePath = "/home/abu/Desktop/1.txt";
        FileWriter myFile = new FileWriter( myFilePath );
        BufferedWriter myFileBuffer = new BufferedWriter( myFile );

        String content = "This is my first file.\nThis is my second line.";
        myFileBuffer.write( content );
        myFileBuffer.close();

    }

}
