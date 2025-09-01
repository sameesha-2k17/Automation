package selenumproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	public void fileUploadUsingSendkeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadbutton= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		uploadbutton.sendKeys("C:\\Users\\acer\\git\\Automation\\selenumproject\\src\\test\\resources\\sample-local-pdf.pdf");
		WebElement terms= driver.findElement(By.xpath("//input[@id='terms']")); 
		terms.click();
		WebElement submit= driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit.click();
	}
	
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		StringSelection selection =  new StringSelection("C:\\Users\\acer\\git\\Automation\\selenumproject\\src\\test\\resources\\sample-local-pdf.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot= new Robot();
		//For handling the operating time and no error occur
		robot.delay(2500);
        robot.keyPress (KeyEvent.VK_ENTER);
        robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
	}
	public static void main(String[] args)  {
		FileUpload fileupload = new FileUpload();
		fileupload.browserinitializer();
		fileupload.fileUploadUsingSendkeys();
		try {
			fileupload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
