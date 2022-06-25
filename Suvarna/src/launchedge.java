import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class launchedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","D:\\Fireforxdriver\\gecodriver\\msedgedriver.exe");
		WebDriver ABC=new EdgeDriver();
		ABC.get("https://www.concentrix.com");
	}

}
