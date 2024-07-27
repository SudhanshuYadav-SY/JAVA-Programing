package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class login_page_implementation
{
    WebDriver driver;
    @Given("user launches web browser")
    public void user_launches_web_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("maximise the automation window")
    public void maximise_the_automation_window() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("user is on the home page")
    public void user_is_on_the_home_page() {
        driver.get("https://tutorialsninja.com/demo/");
    }

    @Then("User navigates to the login page")
    public void user_navigates_to_the_login_page() {
        driver.findElement(By.xpath("(//*[text()='My Account'])[1]")).click();
        driver.findElement(By.linkText("Login")).click();
    }

    @Then("User enters a valid user email id")
    public void user_enters_a_valid_user_email_id() {
        driver.findElement(By.name("email")).sendKeys("amotooricap9@gmail.com");
    }

    @Then("User enters a valid user password associated the email id")
    public void user_enters_a_valid_user_password_associated_the_email_id() {
        driver.findElement(By.name("password")).sendKeys("1234");
    }

    @Then("User clicks on Login")
    public void user_clicks_on_login() {
        driver.findElement(By.xpath("//*[@value=\"Login\"]")).click();
    }

    @Test(priority = 1)
    @Then("User logins to the system successfully")
    public void user_logins_to_the_system_successfully()
    {
        String actual_Text = driver.findElement(By.xpath("(//*[text()='My Account'])[4]")).getText();
        String expect_Text = "My Account";
        if (actual_Text.equals(expect_Text))
        {
            System.out.println("Login is SUCCESSFUL");
        }
        else
        {
            System.out.println("Login NOT Successful");
        }
    }
    @Then("Finally User closes the browser")
    public void finally_user_closes_the_browser() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }
}