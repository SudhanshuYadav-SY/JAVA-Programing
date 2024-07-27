package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class search_product
{
    WebDriver driver;
    @Given("user launch web browser")
    public void user_launch_web_browser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Then("User opens home page")
    public void user_opens_home_page()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("(//*[text()='My Account'])[1]")).click();
        driver.findElement(By.linkText("Login")).click();
    }
    @Then("User logs in using valid credentials")
    public void user_logs_in_using_valid_credentials()
    {
    }
    @Then("User search a valid product")
    public void user_search_a_valid_product()
    {
    }
}