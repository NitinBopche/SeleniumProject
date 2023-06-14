package ObjectRepository;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class AutomationTesting extends BaseClass{
	Alert alert;
	public AutomationTesting() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[text()=\"SwitchTo\"]") WebElement SwitchTo;
	@FindBy(xpath = "//li[@class=\"dropdown open\"]//ul//li//a") List<WebElement> SwitchToDropValues;
	@FindBy(xpath = "//*[text()=\"Close\"]") WebElement CloseButton;
	
	
	public void ClickSwitchTo() {
		SwitchTo.click();
	}
	public List<WebElement> GetElementOfSwitchToDropValues() {
		return SwitchToDropValues;
	}
	public void ClickCloseButton() {
CloseButton.click();
	}
}
