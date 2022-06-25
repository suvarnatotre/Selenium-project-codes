import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class leunchfirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\Fireforxdriver\\Firefoxdriver\\geckodriver.exe");
		WebDriver ABC=new FirefoxDriver();
		ABC.get("https://www.flipkart.com/");
	
		
		
	}

}
