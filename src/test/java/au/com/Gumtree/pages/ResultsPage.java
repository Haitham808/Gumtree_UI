package au.com.Gumtree.pages;

import au.com.Gumtree.common.Util;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsPage extends PageObject {

    @FindBy(xpath = "//section[@class='search-results-page__user-ad-collection']//a")
    private List<WebElementFacade> results;

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public void chooseRandomResult(){
        int r = (int) (Math.random() * (results.size() - 0)) + 0;
        results.get(r).click();
    }
}
