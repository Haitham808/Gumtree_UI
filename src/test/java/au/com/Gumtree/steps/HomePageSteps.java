package au.com.Gumtree.steps;

import au.com.Gumtree.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSteps extends ScenarioSteps {
    HomePage homePage;


    @Step
    public void iSearchForItem(String item) {
        homePage.iSearchForItem(item);
    }
    @Step
    public void inCategory(String category) {
        homePage.inCategory(category);
    }
    @Step
    public void InRegion(String region) {
        homePage.InRegion(region);
    }
    @Step
    public void withinRange(String range) {
        homePage.withinRange(range);
    }

    @Step
    public void clickOnSearch() {
        homePage.clickOnSearch();
    }




}
