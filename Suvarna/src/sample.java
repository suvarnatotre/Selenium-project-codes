import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12']//following-sibling::div[1]//input[@id='userName']")).sendKeys("Suvarna Totre");
		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12']//following-sibling::div//input[@id='userEmail']")).sendKeys("134568");
		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12']//following-sibling::div[1]//textarea[@id='currentAddress']")).sendKeys("pune abc");
		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12']//following-sibling::div//textarea[@id='permanentAddress']")).sendKeys("pune ghgh");
	     Thread.sleep(0);
	     driver.findElement(By.xpath("//button[contains(@id,'submit')]")).click();//simple xpath bec error getting in sibling
	     
	}
}
