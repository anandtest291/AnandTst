package AppiumTest.AppiumTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LibraryTest {
	
	
	
	@Test
	public void testA() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "F:\\WorkSpaces\\drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 Properties properties= new Properties();
			File f = new File(System.getProperty("user.dir")+"\\src\\Test.properties");
			FileReader freader= new FileReader(f);
			properties.load(freader);
			String data= properties.getProperty("url");
			System.out.println(data);
		 driver.get(data);
		 System.out.println("Testing A");
		 System.out.println("Testing B");
		 System.out.println("Testing C");
//		 7892550529
//		 Test@123
		 
	}
	
/*	@Test
	
	public String readData() throws IOException {
		properties= new Properties();
		File f = new File(System.getProperty("user.dir"+"\\src\\Test.properties"));
		FileReader freader= new FileReader(f);
		properties.load(freader);
		return properties.getProperty("url");
		
	}*/

}
