package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class SampleFrameworkPage extends BasePage implements AutoConstant
{
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement firstnameTextField;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement lastnameTextField;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement usernameTextField;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement passwordTextFiled;
	
	@FindBy (xpath = "(//input[@type='text'])[4]")
	private WebElement emailTextField;
	
	@FindBy (xpath = "(//input[@type='radio'])[1]")
	private WebElement maleradioButton;
	
	@FindBy (xpath = "(//input[@type='radio'])[2]")
	private WebElement femaleradioButton;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement rememberCheckbox;
	
	@FindBy (xpath = "//select[@name='countrycode']")
	private WebElement countrycodeDropdownlist;
	
	@FindBy (xpath = "(//input[@type='text'])[5]")
	private WebElement mobilenumberTextField;
	
	public SampleFrameworkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submitdetails() throws IOException
	{
		
		firstnameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		lastnameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		femaleradioButton.click();
		selectbyvisible(countrycodeDropdownlist, "+852");
		mobilenumberTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 5));
	}
	
	
	
	
	
	
	
	
	
}
