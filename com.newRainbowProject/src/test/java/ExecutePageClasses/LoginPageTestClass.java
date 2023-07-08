package ExecutePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import RetryAnalyzer.RetryAnalyzer;
import pageClass.LoginPageClass;

public class LoginPageTestClass extends BaseClassTest {
	LoginPageClass lp;

	@Test (priority = 1,dataProviderClass = DataProviderLogin.class,dataProvider = "SuccefullLoginDp",retryAnalyzer= RetryAnalyzer.class) 
	public void verifySuccessfulLogin(String uname,String password) {
		lp = new LoginPageClass(driver);
		lp.login(uname,password);
		String actual = lp.getTextOfAdmin();
		String Expected = "Admin";
		Assert.assertEquals(actual, Expected);

	}

	@Test  (priority = 0, dataProviderClass = DataProviderLogin.class,dataProvider = "UnsuccefullLoginDp",retryAnalyzer= RetryAnalyzer.class) 
	public void verifyUnSuccessfulLogin(String uname,String password) {
		lp = new LoginPageClass(driver);
		lp.login(uname,password);
		boolean out = lp.isDisplayedOrNot();
		Assert.assertTrue(out);
		System.out.println(out);
	}

	@Test (priority = 2,retryAnalyzer= RetryAnalyzer.class)
	public void verifyRememberMeCheckBoxIsSlectedOrNot() {
		lp = new LoginPageClass(driver);

		boolean out = lp.isRememberMeSelected();
		Assert.assertFalse(out);

	}

}
