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
import utilities.GeneralUtilities;

public class ManageNewExpensePage {
	WebDriver driver;
	Explicitwait ew = new Explicitwait();
	GeneralUtilities gl = new GeneralUtilities();

	public ManageNewExpensePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//i[@class='far fa-circle nav-icon'])[3]")
	WebElement manageExpense1;
	@FindBy(xpath = "(//a[@class='nav-link'])[5]")
	WebElement manageExpense0;
	@FindBy(xpath = "(//h4[@class='card-title'])[2]")
	WebElement isMangeExpenseDisplayed;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement clickOnAddNewExpense;
	@FindBy(xpath = "(//select[@class='form-control selectpicker'])[1]")
	WebElement useridSelect;

	@FindBy(xpath = "//input[@placeholder='Enter the Date']")
	WebElement selectDate;

	@FindBy(xpath = "//table[@class='table-condensed']//tbody//tr[5]//td[7]")
	WebElement daySelect;
	@FindBy(xpath = "(//select[@class='form-control selectpicker'])[2]")
	WebElement categorySelect;

	@FindBy(xpath = "(//select[@class='form-control selectpicker'])[3]")
	WebElement orderSelect;
	@FindBy(xpath = "(//select[@class='form-control selectpicker'])[4]")
	WebElement purchaseIDSelect;

	@FindBy(xpath = "//select[@class='form-control']")
	WebElement expenseTypeSelect;

	@FindBy(xpath = "//input[@class='form-control']")
	WebElement amountInput;
	@FindBy(xpath = "//input[@type='file']")
	WebElement chooseFile;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement saveButtonClick;

	@FindBy(xpath = "//textarea[@name='remarks']")
	WebElement remarksClick;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement clickOnSearch;

	@FindBy(xpath = "//select[@name='um']")
	WebElement selectOnSearch1;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement clickOnSearch2;

	@FindBy(xpath = "(//select[@class='form-control selectpicker'])[2]")
	WebElement categorySelect2;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	WebElement selectDate2;

	@FindBy(xpath = "(//table[@class='table table-bordered table-hover table-sm']//tbody//tr//td[1])[1]")
	WebElement tableResult;

	@FindBy(xpath = "//i[@class='icon fas fa-check']")
	WebElement saveButtonDisplay;
/*	
	//i[@class='icon fas fa-check']
	//div[@class='alert alert-success alert-dismissible'] */
	public void MangeExpense1() {
		gl.clickonelement(manageExpense1);
		WebDriverWait waitClick=new WebDriverWait(driver,Duration.ofSeconds(10));
		 waitClick.until(ExpectedConditions.visibilityOf(manageExpense1));
	}

	public void ManageExpense0() {
		gl.clickonelement(manageExpense0);
		WebDriverWait waitClick=new WebDriverWait(driver,Duration.ofSeconds(10));
		 waitClick.until(ExpectedConditions.visibilityOf(manageExpense0));
	}

	public boolean isMangeExpenseDisplayed() {
		return gl.isDisplayed(isMangeExpenseDisplayed);
	}

	public void clickOnAddNewExpense() {
		gl.clickonelement(clickOnAddNewExpense);
	}

	public void useridSelect(String value) {
		gl.selectByvalue(useridSelect, value);
	}

	public void useridSelect0(int value) {
		gl.selectByIndex(useridSelect, value);
	}

	public void selectDate() {
		gl.clickonelement(selectDate);
	}

	public void daySelect() {
		gl.clickonelement(daySelect);
	}

	public void categorySelect(int value) {
		gl.selectByIndex(categorySelect, value);
	}

	public void orderSelect(int value) {
		gl.selectByIndex(orderSelect, value);
	}

	public void purchaseIDSelect(int value) {
		gl.selectByIndex(purchaseIDSelect, value);
	}

	public void expenseTypeSelect(int value) {
		WebDriverWait waitClick=new WebDriverWait(driver,Duration.ofSeconds(10));
		 waitClick.until(ExpectedConditions.visibilityOf(expenseTypeSelect));
		gl.selectByIndex(expenseTypeSelect, value);
	}

	public void amountInput(String value) {
		gl.typeElement(amountInput, value);
	}

	public void chooseFile(String value) {
//		gl.clickonelement(chooseFile);
		gl.typeElement(chooseFile, value);
	}

	public void saveButtonClick() {
		ew.elementTobEClickable(driver, saveButtonClick);
		gl.clickElementjs(driver, saveButtonClick);
	}

	public String readValue(int row, int coloumn) throws IOException {
		return ExcelRead.getStringData(row, coloumn);
	}

	public String readValueInteger(int row, int column) throws IOException {
		return ExcelRead.getIntegerData(row, column);
	}

	public void remarksClick(String value) {
		gl.clickonelement(remarksClick);
		gl.typeElement(remarksClick, value);
	}

	public void clickOnSearch() {
		gl.clickonelement(clickOnSearch);
	}

	public void selectOnSearch1(int value) {
		gl.selectByIndex(selectOnSearch1, value);
	}

	public void clickOnSearch2() {
		gl.clickonelement(clickOnSearch2);
	}

	public void categorySelect2(int value) {
		gl.selectByIndex(categorySelect2, value);
	}

	public void selectDate2() {
		gl.clickonelement(selectDate2);
	}

	public boolean tableResult() {
		return gl.isDisplayed(tableResult);
	}
	public boolean saveButtonDisplay() {
		return gl.isDisplayed(saveButtonDisplay);
	}
}
