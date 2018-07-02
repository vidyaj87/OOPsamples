package samples;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class K_SeleniumPlugin
{
    // Get the jar http://selenium.googlecode.com/files/selenium-java-2.35.0.zip
    // Include the selenium-java-2.35.0.jar as well as all the jars from the extracted libs folder
    public static void main( String[] args ) throws InterruptedException, IOException
    {
        WebDriver myWebDriver = new FirefoxDriver();
        myWebDriver.manage().timeouts().implicitlyWait( 15, TimeUnit.SECONDS );
        myWebDriver.get( "http://www.gmail.com" );

        WebElement userNameElement = myWebDriver.findElement( By.name( "Email" ) );
        WebElement passwordElement = myWebDriver.findElement( By.name( "Passwd" ) );

        userNameElement.sendKeys( "seletest2013@gmail.com" );
        passwordElement.sendKeys( "getmein123" );
        passwordElement.submit();

        File scree = ( ( TakesScreenshot ) myWebDriver ).getScreenshotAs( OutputType.FILE );
        FileUtils.copyFile( scree, new File( "/home/abu/Desktop/abc.png" ) );
    }
}
