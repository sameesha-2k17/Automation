package selenumproject;

public class NavigationCommands extends Base {
	
	public void redirectnext() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommands nav= new NavigationCommands();
		nav.browserinitializer();
		nav.redirectnext();
		
	}

}
