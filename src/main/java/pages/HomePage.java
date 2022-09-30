package pages;


import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class= 'css-1h30cts eanm77i0']")
	WebElement header;

	public void header() throws InterruptedException {
		Thread.sleep(3000);
		header.click();
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//input[@name= 'username']")
	WebElement user;

	public void userLogin() throws InterruptedException {
		Thread.sleep(3000);
		user.click();
		Thread.sleep(3000);
	}

	@FindBy(id = "//input[@id= 'site_search_input']")
	WebElement searchId;

	public void searchID() throws InterruptedException {
		Thread.sleep(3000);
		searchId.click();
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//a[@class= 'css-cdhtj']")
	WebElement logo;

	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is displayed: " + flag);
		return flag;
	}
	
	@FindBy(how = How.XPATH, using = "//button[@class= 'css-de3t8h eanm77i0']")
	WebElement createAccount;
	
	public void createAccount() throws InterruptedException {
		Thread.sleep(3000);
		createAccount.click();
		Thread.sleep(3000);
	
	}
	

}
