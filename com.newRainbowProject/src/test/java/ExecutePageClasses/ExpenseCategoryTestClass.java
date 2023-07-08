package ExecutePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageClass.ExpenseCategory;
import pageClass.HomePageClass;
import pageClass.LoginPageClass;

public class ExpenseCategoryTestClass extends BaseClassTest {
	LoginPageClass lp;
	HomePageClass hp;
	ExpenseCategory ec;

	@Test(priority = 1, groups = { "create" })
	public void verifyToCreateNewExpense() throws IOException {
		lp = new LoginPageClass(driver);
		hp = new HomePageClass(driver);
		ec = new ExpenseCategory(driver);

		lp.login("admin", "admin");
		hp.clickManageExpense();
		hp.clickExpenseCategory();

		ec.clickOnNew();
//		ec.typeOnTitle("NewToast");
		ec.typeOnTitle(ec.readExcel(2, 1));
		ec.clickOnSave();
		boolean actual = ec.newExpenseCategoryCreatedOrNot();
		Assert.assertTrue(actual);

	}

	@Test(priority = 2, groups = { "search" })
	public void verifyToSearchCreatedExpense() throws IOException {
		lp = new LoginPageClass(driver);
		hp = new HomePageClass(driver);
		ec = new ExpenseCategory(driver);

		lp.login("admin", "admin");
		hp.clickManageExpense();
		hp.clickExpenseCategory();

		ec.clickOnSearch();
//		ec.typeOnTitleForSearch("NewToast");
		ec.typeOnTitleForSearch(ec.readExcel(2, 1));
		ec.clickOnSearch1();
		boolean actual = ec.isToastDisplayedOrNot();

		Assert.assertTrue(actual);

	}

	@Test(priority = 3, groups = { "delete" })
	public void verifyToDeleteCreatedExpense() throws IOException {
		lp = new LoginPageClass(driver);
		hp = new HomePageClass(driver);
		ec = new ExpenseCategory(driver);

		lp.login("admin", "admin");
		hp.clickManageExpense();
		hp.clickExpenseCategory();

		ec.clickOnSearch();
//		ec.typeOnTitleForSearch("NewToast");
		ec.typeOnTitleForSearch(ec.readExcel(2, 1));

		ec.clickOnSearch1();
		boolean actual = ec.isToastDisplayedOrNot();
		Assert.assertTrue(actual);
		ec.clickOnDeleteIcon();
		ec.alertAccept();
	}
}
