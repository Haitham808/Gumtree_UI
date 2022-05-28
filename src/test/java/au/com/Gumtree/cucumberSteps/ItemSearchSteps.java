package au.com.Gumtree.cucumberSteps;

import au.com.Gumtree.common.Util;
import au.com.Gumtree.steps.HomePageSteps;
import au.com.Gumtree.steps.ItemPageSteps;
import au.com.Gumtree.steps.ResultsPageSteps;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class ItemSearchSteps extends PageObject {

    @Steps
    HomePageSteps homePageSteps;
    @Steps
    ResultsPageSteps resultsPageSteps;
    @Steps
    ItemPageSteps itemPageSteps;


    @Given("I'm in Gumtree homepage")
    public void iMInGumtreeHomepage() {
        String url = new Util().getProp("baseURL");
        getDriver().get(url);
    }

    @When("I search for {string}")
    public void iSearchForItem(String item) {
        homePageSteps.iSearchForItem(item);
    }

    @And("In {string} from Categories" )
    public void inCategory(String category) {
        homePageSteps.inCategory(category);
    }

    @And("In {string}")
    public void InRegion(String region) {
        homePageSteps.InRegion(region);
    }

    @And("within {string}")
    public void withinRange(String range) {
        homePageSteps.withinRange(range);
    }

    @And("Click on search")
    public void clickOnSearch() {
        homePageSteps.clickOnSearch();
    }

    @And("Choose random result")
    public void chooseRandomResult() {
        resultsPageSteps.chooseRandomResult();
    }

    @Then("Verify the ad details page opens")
    public void verifyTheAdDetailsPageOpens() {
        itemPageSteps.verifyTheAdDetailsPageOpens();
    }

    @And("Verify a numeric ad id is displayed in the breadcrumbs")
    public void verifyANumericAdIdIsDisplayedInTheBreadcrumbs() {
        itemPageSteps.verifyANumericAdIdIsDisplayedInTheBreadcrumbs();
    }

    @And("Verify at least one similar ad is displayed in the page")
    public void verifyAtLeastOneSimilarAdIsDisplayedInThePage() {
        itemPageSteps.verifyAtLeastOneSimilarAdIsDisplayedInThePage();
    }



}
