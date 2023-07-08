package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	public WebDriverWait wait;

	 public void alertIsPresentWait(WebDriver driver) {
  wait= new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.alertIsPresent());

}
public void presenceOfElementLocatedWait(WebDriver driver,String value) {
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(value)));
}
public void elementTobEClickable(WebDriver driver,WebElement element) {
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
public void visiblityOfElement(WebDriver driver,WebElement element) {
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void elementToBeSelected(WebDriver driver,WebElement element) {
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeSelected(By.id(null)));
}
public void visibilityOfElementLocated(WebDriver driver,WebElement element) {
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(null)));
}
}

