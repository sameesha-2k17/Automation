package selenumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	
	public void handleframes() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe")); 
		System.out.println(totalframes);
		System.out.println(totalframes.size());// to print a list of frames in the DOM
		
		//switchTo method is used to change the focus of driver from one point to another
		
		//driver.switchTo().frame(1);// means frame index is 1
		driver.switchTo().frame("frame1");//means frame name
		driver.switchTo().parentFrame();// to change the focus to the immediate i frame tag above
		WebElement iframe1= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe1);
		WebElement h1= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(h1.getText());
		driver.switchTo().defaultContent(); // to redirect/release the driver focus pointer to previously focused pointer
		
	}
	
	public static void main(String[] args) {
		HandlingFrames frames = new HandlingFrames();
		frames.browserinitializer();
		frames.handleframes();
		

	}

}
