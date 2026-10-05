package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	
	
	WebDriver driver = new ChromeDriver();
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("user enter valid username")
	public void user_enter_valid_username() {
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
	    
	}

	@And("user enter valid password")
	public void user_enter_valid_password() {
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
	    
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
	    
	}

	@Then("user should able to logged in successfully")
	public void user_should_able_to_logged_in_successfully() {
		
		driver.quit();
		
	    
	}

}