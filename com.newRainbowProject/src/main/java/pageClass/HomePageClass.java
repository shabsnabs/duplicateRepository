package pageClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePageClass {
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();

	public HomePageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//i[@class='fas fa-arrow-circle-right']")
//	WebElement allTileelementDisplayed;
	List<WebElement>allTile;
	
	@FindBy(xpath = "(//a[@class='nav-link'])[3]")
	WebElement manageOrders;

	@FindBy(xpath = "(//a[@class='nav-link'])[5]")
	WebElement manageExpense;
	
	@FindBy(xpath = "(//i[@class='far fa-circle nav-icon'])[2]")
	WebElement expenseCategory;
	
	@FindBy(xpath = "//*[@class='nav-icon fas fa-tasks']")
	WebElement clickOnManageProduct;
	
	@FindBy(xpath = "(//i[@class='far fa-circle nav-icon'])[1]")
	WebElement manageExpense1;

	
	public boolean isAllElementDisplayed() {
		for (WebElement element1 :allTile) {
			gl.isDisplayed(element1);
		}
		return true;
	}

	public void clickManageExpense() {
		gl.clickonelement(manageExpense);
	}

	public void clickExpenseCategory() {
		gl.clickonelement(expenseCategory);
	}

	public void clickOnManagaeProduct() {
		gl.clickonelement(clickOnManageProduct);
	}

	public void clickonManageExpensebutton() {
		gl.clickonelement(manageExpense1);
	}

	public void clickOnMangeOrders() {
		gl.clickonelement(manageOrders);
	}
}
