package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage{
	WebDriver driver;
//	Actions action
	
	//constructor
	public loginPage(WebDriver D)
	{
		driver = D;
		//this method will create webElement
		PageFactory.initElements(driver, this);
//		action = new Actions(driver);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"First Name\"]") WebElement FirstName;
	@FindBy(xpath = "//li[@class=\"dropdown open\"]") WebElement SwitchToDropdown;
	
	
	public void SendKeywordToFirstName(String Name) {
		FirstName.sendKeys(Name);
	}
//	public  void SwitchToDropdownElement() throws InterruptedException {
//		action.moveToElement(this.SwitchToDropdown);
//		action.click(this.SwitchToDropdown);
//		Thread.sleep(5000);
//	}
	
	public  WebElement  SwtichTodropdown() {
		return this.SwitchToDropdown;
	}
	
	
	
	
	
	
	

}
