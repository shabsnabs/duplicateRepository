package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class LoginPageClass {
	WebDriver driver;
	GeneralUtilities gl= new GeneralUtilities();

 public LoginPageClass(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 @FindBy(name="username")
 WebElement userName;
 @FindBy(name="password")
 WebElement passWord;
 @FindBy(xpath="//button[@type='submit']")
 WebElement signIn;
 @FindBy(xpath="//*[text()=' Admin']")
 WebElement adminText;
 @FindBy(xpath="//label[@for='remember']")
 WebElement rememberMe;
 @FindBy(xpath="//*[text()=' Alert!']")
 WebElement alertMessage;
 
 public void login(String uname,String pwd) {
	 gl.typeElement(userName, uname);
	 gl.typeElement(passWord, pwd);
	 gl.clickonelement(signIn);
 }
 public String getTextOfAdmin()
 { 
	 return gl.gettextofElement(adminText);
 }
 public String getTextOfAlertMessage() {
	 return gl.gettextofElement(alertMessage);
 }
public boolean isRememberMeSelected() {
	return gl.isSelected(rememberMe);
}
public boolean isDisplayedOrNot() {
	return gl.isDisplayed(alertMessage);
}
}