import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramelementchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Suvarnatotre");
        driver.findElement(By.name("password")).sendKeys("12345");
        driver.findElement(By.className("KPnG0")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div[1]/form/div/div[1]/input")).sendKeys("suvarna");
		driver.findElement(By.name("pass")).sendKeys("1245");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}

}

    