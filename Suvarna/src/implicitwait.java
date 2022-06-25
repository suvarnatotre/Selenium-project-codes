import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","D:\\Fireforxdriver\\Firefoxdriver\\geckodriver.exe");
		WebDriver ABC=new FirefoxDriver();
		ABC.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ABC.get("https://www.flipkart.com/");
		ABC.navigate().to("http://www.indiahotel.com/?AspxAutoDetectCookieSupport=1");
		//ABC.get("https://www.flipkart.com/");
		//ABC.navigate().back();
		System.out.println(ABC.getCurrentUrl());
		System.out.println(ABC.getPageSource());
		System.out.println(ABC.getTitle());
		

	}

}
