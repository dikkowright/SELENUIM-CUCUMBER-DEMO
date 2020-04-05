package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class stepDefinitions {


    WebDriver driver;


    @Given("^Open the firefox and start application$")
    public void open_the_firefox_and_start_application()  {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\PEACEHOUSE\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://twitter.com/login/");
    }

    @When("^I enter valid username and valid password$")
    public void i_enter_valid_username_and_valid_password()  {
        driver.findElement(By.xpath("//input[@name='session[username_or_email]']")).sendKeys("YUUT");
        driver.findElement(By.xpath("//input[@name='session[password]']")).sendKeys("GH");

    }

    @Then("^User should be able to login successfully$")
    public void user_should_be_able_to_login_successfully()  {
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        driver.findElement(By.xpath("//body//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']//div//div//div[1]//div[1]//article[1]//div[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[1]//span[1]//span[1]")).click();

        





    }

}
