import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivermethodtolaunchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//webdriver is your interface 
		driver.get("https://inet.idbibank.co.in/");//taking us on on the webpage
		Thread.sleep(2000);
		driver.navigate().to("https://mylti.lntinfotech.com/#/");
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");//to move from one page to an another page
		//driver.navigate().back();
		//driver.close();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());

		
	
	}

}
