package selenumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
public class Locators extends Base { 
	public void locate() {
		WebElement id = driver.findElement(By.id("single-input-field"));
		WebElement element2 = driver.findElement(By.className("form-control"));
		WebElement element3 = driver.findElement(By.name("viewport"));
		WebElement element4 = driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement element5 = driver.findElement(By.partialLinkText("Ajax Form"));
		WebElement element6 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		WebElement element7 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement element8 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		// Css selectors combination
		
		WebElement element9 = driver.findElement(By.cssSelector("input#single-input-field")); //tag name  and id
		WebElement element10 = driver.findElement(By.cssSelector("input.form-control")); // tag name and class
		WebElement element11 = driver.findElement(By.cssSelector("meta[name=viewport]")); // tag name and name
		
		
		
	}
	

	public static void main(String[] args) {
		Locators locators = new Locators();
		locators.browserinitializer();

	}

}
