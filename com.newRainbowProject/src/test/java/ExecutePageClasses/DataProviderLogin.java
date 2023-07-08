package ExecutePageClasses;

import org.testng.annotations.DataProvider;

public class DataProviderLogin {

  @DataProvider(name = "UnsuccefullLoginDp")
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "admin", "qwerty" },
      new Object[] {"qwerty123", "admin" },
      new Object[] {"admin123", "admin007" },
      
    };
  }
  
  @DataProvider(name = "SuccefullLoginDp")
  public Object[][] dp2() {
    return new Object[][] {
      new Object[] { "admin", "admin" },
    };
  }
}
