package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jp_logo_page_object extends BaseClass {

	public Jp_logo_page_object(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "//input[@title='Search']")
	public static WebElement google_search_input;
	
	@FindBy(how = How.XPATH, using = "//div[@jsmodel='vWNDde']")
	public static WebElement click_outside;

	@FindBy(how = How.XPATH, using = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
	public static WebElement google_search_button;
	
	
	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='J.P. Morgan | Official Website']")
	public static WebElement google_search_results;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='logo-desktop-only']//img[@alt='J.P. Morgan logo']")
	public static WebElement jp_morgan_logo;
	
	 public static void send_value(WebElement item, String value){
			WebDriverWait wait1 = new WebDriverWait(driver, 90);
			WebElement element = wait1.until(ExpectedConditions.visibilityOf(item));
			element.sendKeys(value); 
	 }
	
}
