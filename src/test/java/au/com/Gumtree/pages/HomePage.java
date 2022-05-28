package au.com.Gumtree.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageObject {


    @FindBy(id = "search-query")
    private WebElementFacade searchQuery;

    @FindBy(id = "categoryId-wrp")
    private WebElementFacade categoriesDropDown;

    @FindBy(xpath = "//div[@id='categoryId-wrpwrapper']/ul/li/div")
    private List <WebElementFacade> categories;

    @FindBy(id = "search-area")
    private WebElementFacade searchArea;

    @FindBy(id = "srch-radius-wrp")
    private WebElementFacade rangeDropDown;

    @FindBy(xpath = "//div[@id='srch-radius-wrpwrapper']/ul/li/div")
    private List <WebElementFacade> rangeList;

    @FindBy(xpath = "//form[@id='search-form-form']//button[@type='submit']")
    private WebElementFacade search;




    public HomePage(WebDriver driver) {
        super(driver);
    }




    public void iSearchForItem(String item){
        searchQuery.type(item);
    }

    public void inCategory(String category){
        categoriesDropDown.click();
        for (WebElementFacade element : categories ) {
            if(element.getText().equalsIgnoreCase(category)){
                element.click();
            }
        }
    }

    public void InRegion(String region){
        searchArea.type(region);
    }

    public void withinRange(String range){
        rangeDropDown.click();
        for (WebElementFacade element : rangeList ) {
            if(element.getText().equalsIgnoreCase(range)){
                element.click();
            }
        }
    }

    public void clickOnSearch(){
        search.click();
    }





}
