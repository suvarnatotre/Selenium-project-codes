import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//simple xpath 
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).click();
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Create a Page")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();

	}

}
