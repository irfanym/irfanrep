package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import batchRunner.TestBatchRunner;

public class TestMeAppTest {
WebDriver driver;
	@Given("user is on HomePage of TestMeApp")
	public void user_is_on_HomePage_of_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver=DriverUtility.supplyDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp");
	}
	@Given("user chosen for Registration")
	public void user_chosen_for_Registration() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("user user navigates for Registration")
	public void user_user_navigates_for_Registration() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@When("user enters Firstname {string}")
	public void user_enters_Firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(string);
	}

	@When("user enters Lastname {string}")
	public void user_enters_Lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(string);
	}

	@When("user enters Password {string}")
	public void user_enters_Password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@When("user enters Confirm Password {string}")
	public void user_enters_Confirm_Password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(string);
	}

	@When("user selects gender")
	public void user_selects_gender() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
	}

	@When("user enters Email {string}")
	public void user_enters_Email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(string);
	}

	@When("user enters Mobilenumber {string}")
	public void user_enters_Mobilenumber(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(string);
	}

	@When("user enters Dob {string}")
	public void user_enters_Dob(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(string);
	}

	@When("user enters Address {string}")
	public void user_enters_Address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(string);
	}

	@When("user selects security question")
	public void user_selects_security_question() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]/option[2]")).click();
	}

	@When("user enters Answer {string}")
	public void user_enters_Answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(string);
	}

	@When("user clicks on Registration")
	public void user_clicks_on_Registration() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}

	@Then("user should receive a confirmation mail")
	public void user_should_receive_a_confermation_mail() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Received confirmation mail");
		
	}

	@Then("user should see personalized greeting meaasge")
	public void user_should_see_personalized_greeting_meaasge() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.close();
		
	}

	@Given("user chosen for Login")
	public void user_chosen_for_Login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user navigates for login")
	public void user_navigates_for_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("user enters username{string}")
	public void user_enters_username1(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@When("user enters Password{string}")
	public void user_enters_Password1(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		
	}

	@Then("message displayed as login successfully")
	public void message_displayed_as_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.close();
		
	}
	
	@Given("user has registered into testme app")
	public void user_has_registered_into_testme_app() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	
	}

	@When("user search a perticular product like headphones")
	public void user_search_a_perticular_product_like_headphones() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphones");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("user try to poceed to payment without adding any item to cart")
	public void user_try_to_poceed_to_payment_without_adding_any_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String a=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]")).getText();
		//if(a.contains("cart"))
		//{
		//	System.out.println();
		//}
		//else {
			//System.out.println("TestMeApp does not displayed cart icon");
		Assert.assertFalse(a.contains("cart"));
		
	}

	@Then("TestMe App does not display cart icon")
	public void testme_App_does_not_display_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("TestMeApp does not displayed cart icon");
	}


}
