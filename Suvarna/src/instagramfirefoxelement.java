import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instagramfirefoxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\Fireforxdriver\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("Suvarna");
		
		//driver.close();

	}

}
