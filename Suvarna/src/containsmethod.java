
public class containsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Contians_Xpath {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			    driver.get("https://www.facebook.com/");
			    driver.findElement(By.xpath("//input[contains(@data-testid,'email')]")).sendKeys("9822572324");
			    driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]")).sendKeys("xyz");
			    driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]")).click();
			    Thread.sleep(3000);
			    driver.navigate().back();
			    driver.close();

			}

		}


	}

}
