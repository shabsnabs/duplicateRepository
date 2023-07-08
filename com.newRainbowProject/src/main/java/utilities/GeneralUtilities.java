package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	
		public void clickonelement(WebElement element) {
			element.click();
		}
		public void clearElement(WebElement element) {
			element.clear();
		}
		public void typeElement (WebElement element, String value) {
			element.sendKeys(value);
		}
		public String gettextofElement(WebElement element) {
			return element.getText();
		}
		public String getCurrentURL (WebDriver driver) {
			return driver.getCurrentUrl();
			}
	   public Boolean isDisplayed (WebElement element) {
		   return element.isDisplayed();
	   }
	   public Boolean isSelected (WebElement element) {
		   return element.isSelected();
	   }
	   public void alertFunctionAccept(WebDriver driver) {
			driver.switchTo().alert().accept();
		}

		public void alertFunctionDismiss(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}

		public void alertSendkeys(WebDriver driver, String value) {
			driver.switchTo().alert().sendKeys(value);
		}

		public String alertGetText(WebDriver driver, String value) {
			return driver.switchTo().alert().getText();
		}

	   public void clickElementjs(WebDriver driver,WebElement element) {
		   JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].click();", element);
	   }
	   public void scrolltoanElementjs(WebElement element,WebDriver driver) {
		   JavascriptExecutor js= (JavascriptExecutor) driver;
		   js.executeScript("arguments[0].scrollIntoView();", element);
	   }
	   
	   public void selectByIndex(WebElement element, int index) {
		   Select select= new Select(element);
		   select.selectByIndex(index);
	   }
	   public void selectByvalue(WebElement element, String value) {
		   Select select= new Select(element);
		   select.selectByValue(value); 
	}
	
	}

