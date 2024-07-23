import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class introduction_to_automation
{
    public static void main(String[] args)
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String sourceCode = driver.getPageSource();
        System.out.println("Current URL is - \n"+url);
        System.out.println("Page Title is - \n"+title);
        System.out.println("Page Source is - \n"+sourceCode);
        driver.quit();
    }
}