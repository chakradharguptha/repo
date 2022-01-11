package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
@RunWith(SerenityRunner.class)
public class LoginTest {
	@Managed
	WebDriver driver;
	
	@Test
	public void doLogin() {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("hello serenity !!!");
	
	}
}
