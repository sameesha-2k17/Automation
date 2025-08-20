package selenumproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindows extends Base{
	
	public void handleMultipleWindows() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstHandleid= driver.getWindowHandle();
		WebElement handle1= driver.findElement(By.xpath("//a[text()='Click Here']"));
		handle1.click();
		Set<String> handleids = driver.getWindowHandles();
		System.out.println(handleids);
		
		Iterator<String>values=handleids.iterator();
		while(values.hasNext())
		{
			String current_id=values.next();
			if(!current_id.equals(firstHandleid))
			{
				driver.switchTo().window(current_id);
				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']"));
				email_fld.sendKeys("abc@gmail.com");
				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit_fld.click();
				driver.switchTo().defaultContent();
			}
		}
		
	}

	public static void main(String[] args) {
		HandlingMultipleWindows multiplewindow = new HandlingMultipleWindows();
		multiplewindow.browserinitializer();
		multiplewindow.handleMultipleWindows();

	}

}
