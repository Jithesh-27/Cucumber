package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefinitions {

	WebDriver driver = new ChromeDriver();

	@Given("the user is on google search page")
	public void the_user_is_on_google_search_page() {
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@When("the user enter selenium java in search bar")
	public void the_user_enter_selenium_java_in_search_bar() {
		
		driver.findElement(By.name("q")).sendKeys("Selenium Java");
	}

	@When("hit enter")
	public void hit_enter() {
		
		driver.findElement(By.name("q")).click();
	}

	@Then("the user will able to see the result")
	public void the_user_will_able_to_see_the_result() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}

}
