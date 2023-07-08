package ExecutePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import RetryAnalyzer.RetryAnalyzer;
import pageClass.HomePageClass;
import pageClass.LoginPageClass;
import pageClass.ManageProductPage;


public class ManagaProductTestPage extends BaseClassTest {
	LoginPageClass lp;
	HomePageClass hp;
	ManageProductPage mpp;
  @Test (groups = {"create"},retryAnalyzer= RetryAnalyzer.class)
  public void verifyToSearchaProduct() {
	  
	  lp=new LoginPageClass(driver);
	  hp=new HomePageClass(driver);
	  mpp=new ManageProductPage(driver);
	  
	  lp.login("admin", "admin");
	  hp.clickOnManagaeProduct();
	  mpp.clickOnSearch();
	  mpp.typeonProductCode("1185");
	  boolean actual=mpp.textDisplayedOrNot();
	  Assert.assertTrue(actual);
	  
	  
	  
  }
}
