package selenumproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	public void verifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealertbutton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		simplealertbutton.click();
		Alert simplealert=driver.switchTo().alert();
		System.out.println(simplealert.getText());
		simplealert.accept();//to click ok button
		
	}
	
	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalertbutton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmalertbutton.click();
		Alert confirmalert=driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		//confirmalert.accept(); // to click ok button
		confirmalert.dismiss();
		
	}
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalertbutton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptalertbutton.click();
		Alert promptalert=driver.switchTo().alert();
		promptalert.sendKeys("sameesha");
		promptalert.accept();	
	}

	public static void main(String[] args) {
		HandlingAlerts alerts= new HandlingAlerts();
		alerts.browserinitializer();
		//alerts.verifySimpleAlert();
		//alerts.verifyConfirmAlert();
		alerts.verifyPromptAlert();
	}

}
