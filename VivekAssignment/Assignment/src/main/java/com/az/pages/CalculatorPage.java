package com.az.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.anz.base.TestBase;

import junit.framework.Assert;

public class CalculatorPage extends TestBase  
{
	
   
	public CalculatorPage() {
		
		PageFactory.initElements(driver,this);
												
		 								
												
	}
	
	@FindBy(xpath = "//*[contains(@id,'single')]")
    private WebElement applicationType;
	
	@FindBy(xpath = "//*[@title='Number of dependants']")
    private WebElement numOfDependants;
	
	/*@FindBy(css = "select[title='Number of dependants']>option:nth-of-type(2)")
    private WebElement numOfDependants;*/
	
	@FindBy(xpath = "//*[@id='borrow_type_home']")
    private WebElement propLike;
	
	@FindBy(xpath = "//*[text()='Your annual income (before tax)']//following-sibling::div/input")
    private WebElement anualIncome;
	
	@FindBy(xpath = "//*[text()='Your annual other income (optional)']//following-sibling::div/input")
    private WebElement othAnualIncome;
	
	@FindBy(xpath = "//*[@id='expenses']")
    private WebElement livingExpenses;
	
	@FindBy(xpath = "//*[@id='homeloans']")
    private WebElement homeLoans;
	
	@FindBy(xpath = "//*[@id='otherloans']")
    private WebElement otherLoans;
	
	@FindBy(xpath = "//*[text()='Other monthly commitments']//following-sibling::div/input")
    private WebElement otherCommit;
	
	@FindBy(xpath = "//*[@id='credit']")
    private WebElement creditLimit;
	
	@FindBy(xpath = "//button[@class='start-over']")
    private  List<WebElement> startOver;
	
	@FindBy(xpath = "//*[@id='btnBorrowCalculater']")
    private WebElement btnBorrowCalculater;

	@FindBy(xpath = "//div[@class='borrow__error__text']")
    private WebElement message;
	
	
	
	public void application_Type(){
		applicationType.click();
	}
	
	public void numOf_Dependants(){
		
		Select options = new Select(numOfDependants);
		options.selectByIndex(0);
		
	}
	
	public void prop_Like(){
		propLike.click();
	}
	
	public void anual_Income(String value){
		anualIncome.sendKeys(value);;
	}
	
	public void othAnual_Income(String value){
		othAnualIncome.sendKeys(value);;
	}
	
	public void living_Expenses(String value){
		livingExpenses.sendKeys(value);;
	}
	
	public void home_Loans(String value){
		homeLoans.sendKeys(value);;
	}
	public void other_Loans(String value){
		otherLoans.sendKeys(value);;
	}
	
	public void other_Commit(String value){
		otherCommit.sendKeys(value);
	}
	
	public void credit_Limit(String value){
		creditLimit.sendKeys(value);;
	}
	
	public  void start_Over(){
		startOver.get(0).click();;
	}
	public void btn_Borrow_Calculater(){
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	       
         js.executeScript("arguments[0].click();", btnBorrowCalculater);
		//btnBorrowCalculater.click();
	}
	public void verify_Message(){
		String actual=message.getText();
		System.out.println(actual);
		String expected=pro.getProperty("expectedMessage");
		Assert.assertEquals(expected, actual);
	}
	
}
