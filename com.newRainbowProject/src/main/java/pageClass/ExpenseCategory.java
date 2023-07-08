package pageClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExcelRead;
import utilities.Explicitwait;
import utilities.FluentWaitMethod;
import utilities.GeneralUtilities;

public class ExpenseCategory {
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();
	Explicitwait ew = new Explicitwait();
	FluentWaitMethod fw = new FluentWaitMethod();

	public ExpenseCategory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement clickOnNew;
	@FindBy(xpath = "(//input[@class='form-control'])[2]")
	WebElement typeOnTitle;
	@FindBy(xpath = "//input[@id='un']")
	WebElement typeOnTitle1;
	@FindBy(xpath = "(//button[@class='btn btn-block-sm btn-danger'])[2]")
	WebElement clickOnSave;
	@FindBy(xpath = "//i[@class='icon fas fa-check']")
	WebElement newExpenseCategoryCreated;

	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]//td[1]")
	WebElement searchforToast;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButton;
	@FindBy(xpath = "(//button[@class='btn btn-block-sm btn-danger'])[1]")
	WebElement searchButton1;
	@FindBy(xpath = "(//i[@class='fas fa-trash-alt'])[1]")
	WebElement clickOnDeleteIcon;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertAccept;

	public void clickOnNew() {
		gl.clickonelement(clickOnNew);
	}

	public void typeOnTitleForSearch(String value) {
		gl.typeElement(typeOnTitle1, value);
	}

	public void typeOnTitle(String value) {
//		WebDriverWait waitclick=new WebDriverWait(driver,Duration.ofSeconds(10));
//		waitclick.until(ExpectedConditions.visibilityOf(typeOnTitle));
		
		ew.presenceOfElementLocatedWait(driver, "(//input[@class='form-control'])[2]");
		gl.typeElement(typeOnTitle, value);
	}

	public void clickOnSave() {
		gl.clickonelement(clickOnSave);
	}

	public boolean newExpenseCategoryCreatedOrNot() {

		return gl.isDisplayed(newExpenseCategoryCreated);
	}

	public boolean isToastDisplayedOrNot() {
		return gl.isDisplayed(searchforToast);
	}

	public void searchForAddedElements() {
		gl.typeElement(searchButton, "");
	}

	public void clickOnSearch() {
		gl.clickonelement(searchButton);
	}

	public void clickOnSearch1() {
		WebDriverWait waitClick = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitClick.until(ExpectedConditions.visibilityOf(searchButton1));
		gl.clickonelement(searchButton1);
	}

	public void clickOnDeleteIcon() {
		gl.clickonelement(clickOnDeleteIcon);
	}

	public void alertAccept() {
		gl.alertFunctionAccept(driver);
	}

	public String readExcel(int row, int colomn) throws IOException {
		return ExcelRead.getStringData(row, colomn);
	}

}
