package au.com.Gumtree.test;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/ItemSearch.feature",
        glue = {"au.com.Gumtree.cucumberSteps"})
public class Run_itemSearch {
}
