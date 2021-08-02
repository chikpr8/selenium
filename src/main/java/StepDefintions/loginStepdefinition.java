package StepDefintions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Data tables with maps: for parameterization of test cases

public class loginStepdefinition {
	WebDriver driver;

@Given("^user is already on Login page$")
public void user_is_already_on_Login_page()  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prave\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://ui.cogmento.com/");
    
}
@When("^title of login page is free CRM$")
public void title_of_login_page_is_free_CRM()  {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
			
}

@Then("^user enters username and password$")
public void user_enters_username_and_password(DataTable credentials)  {
	for(Map<String,String> data : credentials.asMaps(String.class, String.class)) {
	driver.findElement(By.xpath("//*[@name='email']")).sendKeys(data.get("username"));
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys(data.get("Password"));
			
			}
    
   
}
@Then("^user clicks on login button$")
public void user_clicks_on_login_button() {
	driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
   
}
@Then("^user is on home page$")
public void user_is_on_home_page() {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Cogmento CRM", title);
}

@Then("^user moves on homeicon$")
public void user_moves_on_homeicon()  {
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@class='home icon']"))).build().perform();
   
   
}

@Then("^user clicks on deals$")
public void user_clicks_on_deals(){
	driver.findElement(By.xpath("//*[@class='money icon']")).click();
   
   
}
@Then("^user clicks on new deal$")
public void user_clicks_on_new_deal()  {
    driver.findElement(By.xpath("//*[@href='/deals/new']")).click();
}

@Then("^user enter deal details$")
public void user_enter_deal_details(DataTable dealdetails)  {
	for(Map<String,String> datadetalis : dealdetails.asMaps(String.class, String.class)) {
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/form/div[1]/div[1]/div/div/input")).sendKeys(datadetalis.get("title"));
		
		
		
	}
    
   
}

}
