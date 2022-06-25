import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorownassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//css selector using tag#id
		//driver.findElement(By.cssSelector("input#ap_email")).sendKeys("suvarna");
		//css selector using#value
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("suvarna");
		//css selector using tag.class
		//driver.findElement(By.cssSelector("input.a-button-input")).click();
		//css selector using tagname[attribute='value']
		driver.findElement(By.cssSelector("input[id='continue']")).click();
		//css selector using tag.classvalue[attribute='value']
		
		
		
		
		

	}

}
