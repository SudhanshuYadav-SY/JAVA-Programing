package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature_Files/login_page.feature" ,
        glue = "src/test/java/Steps/login_page_implementation.java"

)
public class login_page
{

}
