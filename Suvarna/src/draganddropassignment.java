import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate to demo site
	    driver.get("https://demoqa.com/droppable");
	    Actions action=new Actions(driver);
	    //Taking the webelement of dragging
	    WebElement dragme=driver.findElement(By.xpath("//div[text()='Drag me']"));
	    //droping the element
	    WebElement Drophere=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
	   // WebElement Drop=driver.findElement(By.xpath("//div[@id='simpleDropContainer']//child::div[2]"));
	    action.dragAndDrop(dragme, Drophere).build().perform();

	}

}
