package automationapril;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate to demo site
	    driver.get("https://demoqa.com/frames");
	   Thread.sleep(2000);
		//by using the string
	  //  driver.switchTo().frame("frame1");
	    //by using indexing
	  //  driver.switchTo().frame(2);
	   WebElement Frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	   driver.switchTo().frame(Frame1);
	   WebElement msg=driver.findElement(By.xpath("//h1[text()='This is a sample page'][1]"));
	   System.out.println(msg);
	   
	    
}
}
