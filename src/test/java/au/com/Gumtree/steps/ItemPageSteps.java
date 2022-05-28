package au.com.Gumtree.steps;

import au.com.Gumtree.pages.ItemPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ItemPageSteps extends ScenarioSteps {

    ItemPage itemPage;

    @Step
    public void verifyTheAdDetailsPageOpens() {
        itemPage.verifyTheAdDetailsPageOpens();
    }
    @Step
    public void verifyANumericAdIdIsDisplayedInTheBreadcrumbs() {
        itemPage.verifyANumericAdIdIsDisplayedInTheBreadcrumbs();
    }
    @Step
    public void verifyAtLeastOneSimilarAdIsDisplayedInThePage() {
        itemPage.verifyAtLeastOneSimilarAdIsDisplayedInThePage();
    }
}
