package phase5project2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testing {
	WebDriver driver=null;
  @Test(groups = "chrome")
  public void launchchrome() {
	  String path="C:\\Users\\kmano\\seleniumtesting\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

	  driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

  }
  @Test(groups = "chrome",dependsOnMethods = {"launchchrome"})
  public void login() {
	  driver.findElement(By.id("email")).sendKeys("8074471599");
	  driver.findElement(By.id("pass")).sendKeys("Manohar@143");
	  driver.findElement(By.name("login")).click();
  }
}
