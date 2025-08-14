package selenumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
public class TableHandling extends Base{
	
	public void verifyTables() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table1= driver.findElement(By.xpath("//table[@id='dataTable']"));
		//System.out.println(table1.getText());
		WebElement row= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
		System.out.println(row.getText());
		WebElement column= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]/td[2]"));
		System.out.println(column.getText());
		
	}

	public static void main(String[] args) {
		TableHandling table= new TableHandling();
		table.browserinitializer();
		table.verifyTables();

	}

}
