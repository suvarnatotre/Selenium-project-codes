import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
				System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				
				driver.manage().window().maximize();
				driver.findElement(By.name("email")).sendKeys("SUVARNA");
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys("12345");//Absolute Xpath
				driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("12345");//Relative xpath
				driver.findElement(By.name("submit")).click();
				
	}          }
			
			
			
			
			
		



