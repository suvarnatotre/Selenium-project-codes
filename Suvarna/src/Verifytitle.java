//import org.junit.Assert;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Verifytitle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\new chromedriver release\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		//String actualTitle=driver.getTitle()
		String expectedTitle="Facebook – log in or sign up";
	Assert.assertEquals("Condition true",actualTitle,expectedTitle);
	
	}
		}


