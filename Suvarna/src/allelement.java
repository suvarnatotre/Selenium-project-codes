import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class allelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.opera.driver","D:\\operadriver_win64\\operadriver.exe");
		WebDriver ABC=new OperaDriver();
		ABC.get("https://best.aliexpress.com");

	}

}
