package samples;

public class G_Strings
{
    public static void main( String[] args )
    {
        String content1 = "This is the body of a text feild.\n";
        // To end a line use "\n"
        String content2 = "It has many lines.\n";
        String content3 = "This is the third line. ";
        String content4 = "I forgot to add the 'slash N' in the previous line.\n";

        String totalContent = content1 + content2 + content3 + content4;
        System.out.println( totalContent );

        // Modifying using +
        System.out.println( "AFTER MODIFICATION" );

        System.out.println( "" );
        content3 = content3 + "Hurray!\n";
        totalContent = content1 + content2 + content3 + content4;
        System.out.println( totalContent );
    }

}
