import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\new chromedriver release\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");//move from one page to other
		driver.navigate().to("http://www.indiahotel.com/");// can go forward
		//driver.navigate().back();//go back
		//driver.manage().window().maximize();//maximize
		//driver.close();//close the current browser
		//driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		//driver.navigate().to("http://www.indiahotel.com/");//go forward
		driver.manage().window().maximize();//maximize
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.id("MainContent_TravelPromotion1_destination")).sendKeys("Taj Hotel");
		driver.findElement(By.xpath("//input[contains(@class,'MainContent_TravelPromotion1_destination')]")).click();
		//driver.getCurrentUrl();
	
		
		
		

	}

}
