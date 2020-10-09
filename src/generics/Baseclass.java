package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	public Properties pro;
	public  WebDriver driver;
	
	public WebDriver initialize() throws IOException
	{
	FileInputStream fs=new FileInputStream("D:/Ncc4/OodlesTestNG/oodles.properties");
	Properties pro=new Properties();
	pro.load(fs);
	String browsername=pro.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","F:/chromedriver/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://stage.oodleslab.com");
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "F:/gecko/geckodriver-v0.27.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://stage.oodleslab.com");
}
	return driver;
	}
}
