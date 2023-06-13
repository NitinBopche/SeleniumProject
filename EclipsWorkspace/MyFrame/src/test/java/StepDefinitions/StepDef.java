package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ObjectRepository.loginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	public WebDriver driver;
	public loginPage LoginP;
	public Alert alert;
	JavascriptExecutor js;
	public Actions action;
	
//	@Before
//	public void beforeScenario() {
//		WebDriverManager.chromedriver().setup();
//	    driver = new ChromeDriver();
//	    LoginP = new loginPage(driver);
//	    js = (JavascriptExecutor) driver;
//	    action = new Actions(driver);
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
//	    driver.manage().deleteAllCookies();
//	    driver.manage().window().maximize();
//	    
//	}
//	@After
//	public void afterScenario() {
//		driver.close();
//		driver.quit();
//	}
	
	@Given("I lauch auotmation demo website")
	public void open_Web_Site() {
	    driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	@When("I enter Firstname")
	public void i_enter_firstname() throws InterruptedException {
	  LoginP.SendKeywordToFirstName("Nitin");
	  Thread.sleep(5000);
	}
	@When("I move to Switch to dropdown")
	public void i_move_to_switch_to_dropdown() throws InterruptedException {
	}
	@When("I generate allert")
	public void i_generate_allert() throws InterruptedException {
	 alert = driver.switchTo().alert();
	}
	
}
