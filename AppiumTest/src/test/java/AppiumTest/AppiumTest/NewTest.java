package AppiumTest.AppiumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class NewTest {
	public static AndroidDriver driver;
	public static AppiumDriverLocalService service=null;
	public static DesiredCapabilities capabilities;
	@BeforeClass
	public void setUp() {
		service = AppiumDriverLocalService.buildDefaultService();
        service.start();

        if (service == null || !service.isRunning()) {
            throw new AppiumServerHasNotBeenStartedLocallyException("An appium server node is not started!");
        }
   
		      capabilities = new DesiredCapabilities();  
			  capabilities.setCapability("VERSION", "8.0.0");
			  capabilities.setCapability("deviceName","de55b3b6");
			  capabilities.setCapability("platformName","Android");
			  capabilities.setCapability("noReset",true);
			  capabilities.setCapability("appPackage", "com.flipkart.android");
			  capabilities.setCapability("appActivity","com.flipkart.android.activity.HomeFragmentHolderActivity"); 
			  service.start();
			    driver = new AndroidDriver(service.getUrl(), capabilities);
		
	}
	//@AfterClass
	@AfterMethod
	public static void stopAppiumServer() {
		driver.closeApp();
		//service.stop();
	}
	
	@BeforeMethod
	
	public static void launchApp() {
		 driver.launchApp();  
	}
	
  @Test(priority=1)	
  public void TestCase1() {
	 
//	 driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open Drawer']")).click();
//	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	 driver.findElement(By.xpath("//android.widget.LinearLayout[@index='5']")).click();

	driver.findElement(By.id("com.flipkart.android:id/search_widget_textbox")).sendKeys("iphone");
	
	  
  }
//  @Test(priority=2)	
//  public void TestCase2() {
//	  
//	 driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open Drawer']")).click();
//	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	 driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']")).click();
//
//	
//	  
//  }
}
