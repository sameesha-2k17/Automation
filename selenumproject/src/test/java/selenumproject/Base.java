package selenumproject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	
	public void browserinitializer(){
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		//driver = new FirefoxDriver();
		
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		
	}
	public void quitandclose() {
		driver.close();
		driver.quit();
	}

	public static void main (String[] args) {
		Base base= new Base();
		base.browserinitializer();
		base.quitandclose();
	}
}
