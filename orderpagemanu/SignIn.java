package orderpagemanu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
    @Test
	public void sigin() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/manoj.kumarkp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        LandingPage ob = new LandingPage(driver);
        
        ob.SignIn("Manu", "Manu23");

	}

}
