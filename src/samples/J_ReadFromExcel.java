package samples;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

// Import a jar file from http://www.jarfinder.com/index.php/jars/versionInfo/2709
public class J_ReadFromExcel
{
    public static void main( String[] args ) throws BiffException, IOException
    {
        FileInputStream excelFile = new FileInputStream( "/home/abu/Desktop/abc.xls" );
        Workbook wb = Workbook.getWorkbook( excelFile );
        Sheet firstSheet = wb.getSheet( 1 );

        int totalRows = 0;
        int totalColoumns = 0;
        totalColoumns = firstSheet.getColumns();
        totalRows = firstSheet.getRows();

        System.out.println( "Total coloumns :" + totalColoumns );
        System.out.println( "Total Rows :" + totalRows );

        // getCell(coloumn number, row number);
        Cell cell = null;
        String content = null;

        cell = firstSheet.getCell( 0, 0 );// Get the Cell (A1)
        content = cell.getContents();
        System.out.println( "\nA1 cell content: " + content );

        cell = firstSheet.getCell( 1, 0 );// Get the Cell (A2)
        content = cell.getContents();
        System.out.println( "A2 cell content: " + content );

        cell = firstSheet.getCell( 0, 1 );// Get the Cell (B1)
        content = cell.getContents();
        System.out.println( "\nB1 cell content: " + content );

        cell = firstSheet.getCell( 1, 1 );// Get the Cell (B2)
        content = cell.getContents();
        System.out.println( "B2 cell content: " + content );

        /*********** TODO get all the data using loop ***********/

        // System.out.println();// print an empty new line
        // for ( int coloumn = 0; coloumn < totalColoumns; coloumn++ )
        // {
        //
        // for ( int row = 0; row < totalRows; row++ )
        // {
        // cell = firstSheet.getCell( coloumn, row );
        // String cellContent = cell.getContents();
        //
        // System.out.print( cellContent + " " );
        // }
        // System.out.println();// print a new line
        // }

        /***** TODO get the data in pairs, say as username and password *****/

        // for ( int rowNumber = 0; rowNumber < totalRows; rowNumber++ )
        // {
        // String userName = null;
        // String passWord = null;
        // cell = firstSheet.getCell( 0, rowNumber );// get the username coloumn (col 0)
        // userName = cell.getContents();
        //
        // cell = firstSheet.getCell( 1, rowNumber ); // get the password coloumn (col 1)
        // passWord = cell.getContents();
        //
        // System.out.print( "USER NAME : " + userName );
        // System.out.println( " PASSWORD : " + passWord );
        // // Here you can do the selenium part,ie: to go to a
        // // webpage and supply the user name and password.
        //
        // }

    }
}
