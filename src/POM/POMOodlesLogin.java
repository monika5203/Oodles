package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Baseclass;

public class POMOodlesLogin  {
	public WebDriver driver;

	@FindBy(id="username")
	private WebElement emailtextfield;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwdtextfield;
	
	@FindBy(xpath="//button[.='Login']")
   private WebElement loginbtn;
	
	@FindBy(id="rememberMe")
	private WebElement keepmeloggedincheckbox;

	public POMOodlesLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Oodleslogin() throws InterruptedException 
	{
		Thread.sleep(5000);
		emailtextfield.sendKeys("manish.kumar@oodlestechnologies.com");
		pwdtextfield.sendKeys("Dashboard@DG");
		loginbtn.click();
}
	/*public void OodlesLoginA() throws InterruptedException
	{
		Thread.sleep(5000);
		emailtextfield.sendKeys("ma.sharma@oodlestechnologies.com");
		pwdtextfield.sendKeys("Dashboard@DG");
		//keepmeloggedincheckbox.click();
		loginbutton.click();
}
	public void OodlesLoginB() throws InterruptedException
	{
		Thread.sleep(5000);
		emailtextfield.sendKeys("monika.sharma@oodlestechnologies.com");
		pwdtextfield.sendKeys("board@DG");
		//keepmeloggedincheckbox.click();
		loginbutton.click();
}*/

	}


