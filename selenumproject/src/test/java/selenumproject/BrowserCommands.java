package selenumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	public WebDriver driver;
	
	public void browserinitializer() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}
	public void browserCommands() {
		String title= driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pagesource= driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		BrowserCommands browser=new BrowserCommands();
		browser.browserinitializer();
		browser.browserCommands();
		
		// TODO Auto-generated method stub

	}

}
