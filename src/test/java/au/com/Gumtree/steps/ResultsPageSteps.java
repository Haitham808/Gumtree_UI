package au.com.Gumtree.steps;


import au.com.Gumtree.pages.ResultsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ResultsPageSteps extends ScenarioSteps {

    ResultsPage resultsPage;


    @Step
    public void chooseRandomResult() {
        resultsPage.chooseRandomResult();
    }


}
