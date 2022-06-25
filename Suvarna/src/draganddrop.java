import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\new chromedriver release\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate to demo site
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		  //Taking the webelement of dragging
		WebElement drag=driver.findElement(By.id("draggable"));
		  //droping the element
		WebElement drophere=driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag,drophere).build().perform();

	}

}
