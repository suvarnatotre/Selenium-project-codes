
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);//global
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		//using css select tag#id
		//driver.findElement(By.cssSelector("input#email")).sendKeys("9822572324");
        //removing tagname using only" # and its value"
		//driver.findElement(By.cssSelector("#email")).sendKeys("576576768");
		//css selectors by using dot operrator  tag.classs
		//driver.findElement(By.cssSelector("input.inputtext. _55r1. _6luy")).sendKeys("vgh");
		//css selectorby using tag[attribute='value']
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("123");
		
	}
}


int myint=9;
char mychar=char(myint)