package au.com.Gumtree.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemPage extends PageObject {

    @FindBy(id = "input-reply-widget-form-message")
    private WebElementFacade replyMessage;

    @FindBy(xpath = "//div[@class='breadcrumbs__desktop']/span[contains(text(),'Ad ID ')]")
    private WebElementFacade numericAdID;

    @FindBy(xpath = "//div[@class='slider slider--offset vip-slidable-ads']//ul/li")
    private List<WebElementFacade> similarAds;

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public void verifyTheAdDetailsPageOpens(){

        assertThat(replyMessage.isVisible())
                .as("Check Ad details page is opened")
                .isTrue();

    }

    public void verifyANumericAdIdIsDisplayedInTheBreadcrumbs(){
        assertThat(numericAdID.getText())
                .as("Check Ad ID numeric value is displayed")
                .containsPattern("[0-9]");

    }

    public void verifyAtLeastOneSimilarAdIsDisplayedInThePage(){
        assertThat(similarAds.size())
                .as("Check at least one similar ad in the page")
                .isGreaterThan(0);
    }
}
