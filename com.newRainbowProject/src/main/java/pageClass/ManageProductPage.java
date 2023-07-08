package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Explicitwait;
import utilities.GeneralUtilities;

public class ManageProductPage {
	WebDriver driver;
	Explicitwait ew= new Explicitwait();
	GeneralUtilities gl = new GeneralUtilities();
	
	public ManageProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//*[@class='btn btn-rounded btn-primary']")
	WebElement search;
	
	@FindBy(xpath="(//*[@class='form-control'])[3]")
    WebElement productCode;
	
	@FindBy(xpath="(//*[contains(@class,'table ')]//tbody//tr[1]//td[1]//button[@type='button'])[1]")
	WebElement p1185text;
	public void clickOnSearch() {
		ew.presenceOfElementLocatedWait(driver, "//*[@class='btn btn-rounded btn-primary']");
		gl.clickonelement(search);
		
	}
	
	public void typeonProductCode(String value) {
		ew.visiblityOfElement(driver, productCode);
		gl.typeElement(productCode, value);
	}
	
	public boolean textDisplayedOrNot() {
		ew.elementTobEClickable(driver, p1185text);
		return gl.isDisplayed(p1185text);
	}
	
	

}