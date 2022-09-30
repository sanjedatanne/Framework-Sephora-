package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import hw_21.Base;

public class HomePageTest extends Base {

	@Test(enabled = false, priority = 1)
	public void clickLogo() {
		homePage.logoDisplayed();
	}
	
	@Test(enabled = false, priority = 2)
	public void header() throws InterruptedException {
		homePage.header();
	}
	
	@Test(enabled = false, priority = 3)
	public void user() throws InterruptedException {
		homePage.userLogin();
		}
	
	@Test(enabled = false, priority = 4)
	public void searchID() throws InterruptedException {
		homePage.searchID();
	}
	
	@Test (enabled = true)
	public void createAccount() throws InterruptedException {
		homePage.createAccount();
	
	}
}
