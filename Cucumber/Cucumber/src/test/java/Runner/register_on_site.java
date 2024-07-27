package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature_Files/Registeration/account_creation.feature",
        glue = "src/test/java/Steps/register_account_details.java"
)
public class register_on_site
{

}
