import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
	
	@Test
	public void homePageCheck() throws MalformedURLException {
		
		DesiredCapabilities caps= new DesiredCapabilities();
	//	caps.setBrowserName("firefox");
	//	caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.57:4444"), caps);
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
