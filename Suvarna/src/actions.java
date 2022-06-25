import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		//WebElement doubleClick=driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']//following-sibling::div[1]//button[@id='doubleClickBtn']"));
		//WebElement RightClick=driver.findElement(By.cssSelector("button#rightClickBtn"));
	    WebElement Click=driver.findElement(By.id("R53Hs"));
		//action.doubleClick(doubleClick).build().perform();
		//action.contextClick(RightClick).build().perform();
		action.click(Click).perform();
		
		

	}

}
