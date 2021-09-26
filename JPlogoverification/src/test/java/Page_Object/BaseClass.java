package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	 public static boolean bResult;
	 public BaseClass(WebDriver driver){
		 BaseClass.driver = driver;
		 BaseClass.bResult = true;
		 }
	 

	 public static boolean get_text_element(WebElement item){
			WebDriverWait wait2 = new WebDriverWait(driver, 90);
			WebElement element = wait2.until(ExpectedConditions.visibilityOf(item));
			boolean text_value= element.isDisplayed();
			return text_value;
	 }
	 
	 public static void click_element(WebElement item){
			WebDriverWait wait2 = new WebDriverWait(driver, 90);
			WebElement element = wait2.until(ExpectedConditions.visibilityOf(item));
			element.click();	 
	 }
}
