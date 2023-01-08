package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.anz.base.TestBase;
import com.az.pages.CalculatorPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class CalculatorStepDefinitions extends TestBase 
    
{
	CalculatorPage page;
	public CalculatorStepDefinitions(){
		super();
		 
	}
	
	 
	@Given("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
		
		intialization();
		 page=new CalculatorPage();
		
		}
	
	@When("^User select single for Application type$")
	public void user_select_single_for_Application_type() throws Throwable {
		 page.application_Type();
	 	}

	@When("^User select zero dependant$")
	public void user_select_zero_dependant() throws Throwable {
	    page.numOf_Dependants();
	}

	@When("^User enters \"([^\"]*)\" for anual income$")
	public void user_enters_for_anual_income(String arg1) throws Throwable {
		
	    page.anual_Income(arg1);
	}

	@When("^User enter \"([^\"]*)\" for other anual income$")
	public void user_enter_for_other_anual_income(String arg1) throws Throwable {
		
	    page.othAnual_Income(arg1);
	}

	@When("^User enter \"([^\"]*)\" for lving expenses$")
	public void user_enter_for_lving_expenses(String arg1) throws Throwable {
		
	   page.living_Expenses(arg1);
	}

	@When("^User enter \"([^\"]*)\" for Current home loan monthly repayment$")
	public void user_enter_for_Current_home_loan_monthly_repayment(String arg1) throws Throwable {
	    page.home_Loans(arg1);
	}

	@When("^User enter \"([^\"]*)\" for Other loan monthly repayment$")
	public void user_enter_for_Other_loan_monthly_repayment(String arg1) throws Throwable {
	   page.other_Loans(arg1);
	}

	@When("^User enter \"([^\"]*)\" for other commitments$")
	public void user_enter_for_other_commitments(String arg1) throws Throwable {
	    page.other_Commit(arg1);
	}

	@When("^User enter \"([^\"]*)\" for credit card limit$")
	public void user_enter_for_credit_card_limit(String arg1) throws Throwable {
	    page.credit_Limit(arg1);
	}

	@When("^User click on start over button$")
	public void user_click_on_start_over_button() throws Throwable {
	   page.start_Over();
	}

	@When("^user click on borrow button calculator$")
	public void user_click_on_borrow_button_calculator() throws Throwable {
	   page.btn_Borrow_Calculater();
	}

	@Then("^verify the message$")
	public void verify_the_message() throws Throwable {
	    page.verify_Message();
	}



}
