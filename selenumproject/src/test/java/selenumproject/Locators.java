package selenumproject;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
 
public class Locators extends Base { 
	public void locate() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
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
		
	  //Method by Combination of AND, OR
	    
	    WebElement element12 = driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		WebElement element13 = driver.findElement(By.xpath("//button[@type='button' or @id='button-one']"));
	    

		
		//Xpath access methods
		
		
		WebElement element14 = driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']")); //Identify the parent as "Parent of Child"
		WebElement element15 = driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']")); //Identify the child as "Child of Parent"
		
		WebElement element16 = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']")); //Identify the following node
		WebElement element17 = driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']")); //Identify the preceding node
		WebElement element18 = driver.findElement(By.xpath("//div/ancestor::div[@class='card']")); //Identify the node from ancestor - eg: You are the grand daughter of ABC
		WebElement element19= driver.findElement(By.xpath("//div[@class='card']//descendant::div")); //Identify the node from descendant eg: You are the grandmother of ABC
	    
		
	}
	

	public static void main(String[] args) {
		Locators locators = new Locators();
		locators.browserinitializer();
		locators.locate();

	}

}
