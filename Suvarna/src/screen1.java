import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class screen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.opera.driver","D:\\operadriver_win64\\operadriver.exe");
		WebDriver ABC=new OperaDriver();
		ABC.get("https://www.flipkart.com");
		TakesScreenshot ts =(TakesScreenshot)ABC;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\Screenshots\\Image.png"));
		
	

		 
	}

}
