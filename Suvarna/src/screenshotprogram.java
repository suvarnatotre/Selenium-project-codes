import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//system class  by suing the setproperty keys and value
		        System.setProperty("webdriver.chrome.driver","D:\\Fireforxdriver\\new chromedriver release\\new chome\\chromedriver.exe");
				//webdriver is your interface driver id ref val chromedriver is ur class
			    WebDriver driver=new ChromeDriver();
			    //we are launching the url
			    driver.get("https://www.amazon.in/");
			    //Takescreen shot interface we type casting  assigen to ref ts
			    TakesScreenshot ts= (TakesScreenshot)driver;
			    //the class file hiding the internal detial and showin the functionality
			    File srcfile= ts.getScreenshotAs(OutputType.FILE);
			    //fileutils it is an class copy file is ur method
			    FileUtils.copyFile(srcfile,new File("C:\\Users\\TOTRE\\eclipse-workspace\\Suvarna\\src\\screenshotprogram.java","img1.jpeg"));
			    
	

	}

}
