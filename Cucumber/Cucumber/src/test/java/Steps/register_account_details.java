package Steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class register_account_details
{
    WebDriver driver;
    @BeforeMethod
    @Given("User opens the automation browser")
    public void user_opens_the_automation_browser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Then("User is on the home page")
    public void user_is_on_the_home_page()
    {
        driver.navigate().to("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @Then("User reaches Registeration Page")
    public void user_reaches_registeration_page()
    {
        driver.findElement(By.xpath("(//*[text()='My Account'])[1]")).click();
        driver.findElement(By.linkText("Register")).click();
    }
    @Test
    @Then("User enters the Details Requested")
    public void user_enters_the_details_requested()
    {
        driver.findElement(By.id("input-firstname")).sendKeys("Aarushi");
        driver.findElement(By.name("lastname")).sendKeys("Savitri");
        driver.findElement(By.name("email")).sendKeys("aarushi.savitri@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("+91-978787890");
        driver.findElement(By.name("password")).sendKeys("Aarushi@123");
        driver.findElement(By.name("confirm")).sendKeys("Aarushi@123");
        driver.findElement(By.xpath("//*[text()='Yes']")).click();
    }
}