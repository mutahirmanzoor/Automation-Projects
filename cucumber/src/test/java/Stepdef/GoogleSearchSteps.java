package Stepdef;

import org.openqa.selenium.WebDriver;

public class GoogleSearchSteps {

	WebDriver driver = null;

//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Browser is open");
//
//		String projectpath = System.getProperty("user.dir");
//		System.out.println("Project Path is:" + projectpath);
//		System.setProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("user is on google Search Page");
//		driver.navigate().to("https://google.com");
//	}
//
//	@When("user enters search term")
//	public void user_enters_search_term() {
//
//		driver.findElement(By.name("q")).sendKeys("Uvaish.Nasir");
//		System.out.println("User enters search term");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("User hits enter");
//
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		;
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//
//		driver.getPageSource().contains("Mohd Uvaish Nasir");
//		System.out.println("user is navigated to search results");
//	}

}
