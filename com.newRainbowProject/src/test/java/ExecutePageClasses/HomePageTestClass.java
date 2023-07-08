package ExecutePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import RetryAnalyzer.RetryAnalyzer;
import pageClass.HomePageClass;
import pageClass.LoginPageClass;

public class HomePageTestClass extends BaseClassTest {
	LoginPageClass lp;
	HomePageClass hp;
	
  @Test (groups = {"group1"},retryAnalyzer= RetryAnalyzer.class)
  public void verifyAllTileDisplayed() {
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  
	  lp.login("admin", "admin");
	  boolean actual=hp.isAllElementDisplayed();
	  Assert.assertTrue(actual);
  }
}
