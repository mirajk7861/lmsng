package common;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LOgin {
	public static WebDriver driver;
	public static void login(String environment) throws InterruptedException
	{
		
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		/****capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability("requireWindowFocus", true);****/
		capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability("requireWindowFocus", true);
		capability.setCapability("ignoreZoomSetting", true);			
		//System.out.println("capability::::"+capability);
		System.setProperty("webdriver.ie.driver","C:\\src\\test\\resources\\IEDriverServer.exe");
		System.out.println("C:\\src\\test\\resources\\IEDriverServer.exe");
		Thread.sleep(3000);
		driver=new InternetExplorerDriver(capability);		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("http://www.google.com");
		System.out.println("google open");
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, "0"));
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
