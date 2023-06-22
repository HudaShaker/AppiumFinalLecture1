import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AutomationFinal {
	  DesiredCapabilities caps = new DesiredCapabilities();


	@BeforeTest
    public void mySetup() throws MalformedURLException {
    File app = new File("src/calculator.apk");
    
    
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    caps.setCapability(MobileCapabilityType.DEVICE_NAME,"huda99");

//    caps.setCapability("chromedriverExecutable","C:\\Users\\User\\OneDrive\\Desktop\\chromewebdriver\\chromedriver.exe");
//    caps.setCapability("chromedriverExecutable","C:\\Users\\User\\Downloads\\chrome\\chromedriver.exe");              
    
//    caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");

    caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
    }
    
    
    @Test()
    public void myFirst() throws MalformedURLException, InterruptedException   {
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
//  9*5
    driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"9\"]\r\n")).click();
    driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"multiply\"]\r\n")).click();
    driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"5\"]\r\n")).click();	 
    driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]\r\n")).click();
    	
    }
    
    
    @AfterTest () 
    public void Finish() {
    
    }
}