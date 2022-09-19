package orderpagemanu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {
  @Test
	public  void signup() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/manoj.kumarkp/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        LandingPage sup = new LandingPage(driver);
        sup.SignUp("manojkumar","K,P","manojkumarkp@gmail.com","manoj123","11/19/2000","9964935495","This is mobile world");
	}

}
