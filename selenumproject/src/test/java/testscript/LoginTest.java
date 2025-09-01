package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNGBase{
	@Test
	public void verifyWhetherUserIsLoggedInWithValidCredentials() throws IOException{
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(usernameValue);
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(passwordValue);
		WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		
	}

}
