package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature_Files/Search_Product/Valid_Product_Search.feature",
        glue = "src/test/java/Steps/search_product.java"
)
public class valid_product_search
{

}