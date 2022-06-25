import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class absoluterelative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();//it will maximize the the window
	    driver.get("https://www.facebook.com/");
             //Absolute xpath
	    // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("hello");
	  
	    //relative xpath
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
	  //  WebElement heading=driver.findElement(By.className("_8eso"));
	    WebElement heading=driver.findElement(By.xpath("//h2[@class='_8eso']"));
	    
	    System.out.println(heading.getText());//to get the string from webpage



	}

}
