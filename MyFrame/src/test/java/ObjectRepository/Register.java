package ObjectRepository;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Utilities.BaseClass;

public class Register extends BaseClass {
	Alert alert;
	Select select;
	Actions actions;
	public Register() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"First Name\"]") WebElement UserName;
	@FindBy(xpath = "//input[@placeholder=\"Last Name\"]") WebElement LastName;
	@FindBy(xpath = "//*[text()=\"Full Name* \"]") WebElement FullName;
	@FindBy(xpath = "//*[text()=\"A/B Testing\"]") WebElement ABTesting;
	@FindBy(xpath = "//*[@class=\"example\"]//p") WebElement Paragraph;
	@FindBy(xpath = "//*[text()=\"Add/Remove Elements\"]") WebElement AddAndRemoveElement;
	@FindBy(xpath = "//button[@onclick=\"addElement()\"]") WebElement AddElement;
	@FindBy(xpath = "//button[@onclick=\"deleteElement()\"]") WebElement DeleteElement;
	@FindBy(xpath = "//*[text()=\"Checkboxes\"]") WebElement Checkboxes;
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]") WebElement Checkbox1;
	@FindBy(xpath = "//button[@onclick=\"deleteElement()\"]") List<WebElement>  DeleteElements;
	@FindBy(xpath = "//*[text()=\"JavaScript Alerts\"]") WebElement AlertOption;
	@FindBy(xpath = "//*[text()=\"Click for JS Alert\"]") WebElement JSAlert;
	@FindBy(xpath = "//*[text()=\"Click for JS Confirm\"]") WebElement JSConfirm;
	@FindBy(xpath = "//*[text()=\"Click for JS Prompt\"]") WebElement JSPrompt;
	@FindBy(xpath = "//ul//li//a[text()]") List<WebElement> ElementsOnHomePage;
	@FindBy(xpath = "//ul//li//button[text()]") List<WebElement> ListOfAlerts;
	@FindBy(xpath = "//ul//li//a") List<WebElement> ListOfFrameTypes;
	@FindBy(xpath = "//*[@id=\"tinymce\"]") WebElement FrameBody;
	@FindBy(xpath = "//iframe[@id=\"mce_0_ifr\"]") WebElement Iframe;
	@FindBy(xpath = "//frame[@name]") List<WebElement> ListOfNestedFrames;
	@FindBy(xpath = "//body[text()]") WebElement Body;
	@FindBy(xpath = "//select[@id=\"dropdown\"]") WebElement Select_Dropdown;
	@FindBy(xpath = "//*[@id=\"column-a\"]") WebElement Source;
	@FindBy(xpath = "//*[@id=\"column-b\"]") WebElement Target;
	@FindBy(xpath = "//*[text()=\"Click ere\"]") WebElement NewWindowClick;
	@FindBy(xpath = "//*[@id=\"file-upload\"]") WebElement ChooseFile;
	@FindBy(xpath = "//*[@id=\"file-submit\"]") WebElement UploadButton;
	@FindBy(xpath = "//*[@id=\"target\"]") WebElement TargetField;
	@FindBy(xpath = "//*[text()=\"Example 1: Element on page that is hidden\"]") WebElement Ex1;
	@FindBy(xpath = "//*[@id=\"start\"]//button") WebElement StartButton;
	@FindBy(xpath = "//*[@id=\"finish\"]//h4") WebElement HelloWorldText;
	
	
	public void SendKeyUsername() {
		UserName.sendKeys("First_Name");
	}
	public void SendKeyLastName() {
		LastName.sendKeys("Last_Name");
	}
	public String GetTextFirstName() {
		String UserNameText =  FullName.getText();
		return UserNameText;
	}
	public void ClickABTesting() {
		ABTesting.click();
	}
	public String GetTextParagraph() {
		return Paragraph.getText();
	}
	public void ClickAddElement() {
		AddElement.click();
	}
	public void ClickDeleteElement() {
		DeleteElement.click();
	}
	public int CountOfDeleteElement() {
		return DeleteElements.size();
	}
	public void ClickAddAndRemoveElement() {
		AddAndRemoveElement.click();
	}
	public boolean AddAndRemoveElementIsDisplayed() {
		return DeleteElement.isDisplayed();
	}
	public void ClickCheckboxes() {
		Checkboxes.click();
	}
	public void ClickCheckbox1() {
		Checkbox1.click();
	}
	public boolean IsCheckbox1Selected() {
		return Checkbox1.isSelected();
	}
	public void GetTextOfDeleteElement() {
		for(WebElement ele : DeleteElements) {
			 System.out.println(ele.getText());
		}
//		int len = DeleteElements.size();
//		for(int i=0; i<len; i++) {
//			System.out.println(DeleteElements.get(i).getText());
//		}
	}
	public void ClickAlertLink() {
		AlertOption.click();
	}
	public void ClickJSAlert() {
		JSAlert.click();
	}
	public void ClickJSConfirm() {
		JSConfirm.click();
	}
	public void ClickJSPrompt() {
		JSPrompt.click();
	}
	public String getTextAlert() {
		alert = driver.switchTo().alert();
		return alert.getText();
	}
	public void ClickOkButton() {
		alert.accept(); 
	}
	public void ClickCancelButton() {
		alert.dismiss();
	}
	public void SendKeyToAlert(String value) {
		alert.sendKeys(value);
	}
	public List<WebElement> ReturnElementsOnHomePage() {
		return ElementsOnHomePage;
	}
	public List<WebElement> ReturnListOfAlerts() {
		return ListOfAlerts;
	}
	public List<WebElement> ReturnListOfFrameTypes() {
		return ListOfFrameTypes;
	}
	public void Frame_Body(String value) throws InterruptedException{
		Thread.sleep(2000);
		FrameBody.clear();
		Thread.sleep(2000);
		FrameBody.sendKeys(value);
		Thread.sleep(2000);
	}
	public void SwitchToIframe() {
		driver.switchTo().frame(Iframe);
	}
	public void SwitchToNestedFrames(int value) {
		WebElement NFrame = ListOfNestedFrames.get(value);
		driver.switchTo().frame(NFrame);
	}
	public String GetTextOfFrame() {
		return Body.getText();
	}
	public void SelectDropdownbyVisibleText(String Value) {
		select = new Select(Select_Dropdown);
		select.selectByVisibleText(Value);
	}
	public void SelectDropdownByIndex(int value) {
		select = new Select(Select_Dropdown);
		select.selectByIndex(value);
	}
	public void SelectDropdownByvalue(String value) {
		select = new Select(Select_Dropdown);
		select.selectByValue(value);
	}
	public void DragAndDropElements() {
//		actions = new Actions(driver);
//		actions.dragAndDrop(Source, Target).build().perform();
//		actions.clickAndHold(Source).moveToElement(Target).release().build().perform();
		FH.dragAndDrop(driver, Source, Target);
	}
	public void ClickNewWindow() {
		NewWindowClick.click();
	}
	public void UploadFile(String value) {
		ChooseFile.sendKeys(value);
	}
	public void ClickUploadButton() {
		UploadButton.click();
	}
	public void RightClick() {
		actions = new Actions(driver);
		actions.contextClick(TargetField).perform();
	}
	public void DoubleClicks() throws InterruptedException {
		TargetField.sendKeys("Helloooooooooo");
		Thread.sleep(2000);
		actions.doubleClick(TargetField).perform();
	}
	public void SelectAllUsingControlPlusAllButton() {
		TargetField.sendKeys("Hiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		TargetField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	}
	public void HoldActions() {
		actions.keyDown(Keys.SHIFT).sendKeys("bjbjhvbhjvjvjh").release().build().perform();
	}
	public String GetTextOfHelloWorld() {
		FH.Click(Ex1);
//		Ex1.click();
		StartButton.click();
//		Fluentwait.until(ExpectedConditions.visibilityOf(HelloWorldText));
//		return HelloWorldText.getText();
		return FH.GetText(HelloWorldText);
	}
}