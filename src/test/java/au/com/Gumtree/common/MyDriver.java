package au.com.Gumtree.common;


import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyDriver implements DriverSource {



    @Override
    public WebDriver newDriver() {
       WebDriver driver;

        String browser = new Util().getProp("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            options.addArguments("disable-extensions");
            //  options.addArguments("--headless");
            options.addArguments("window-size=1920x1080");
            options.addArguments("--start-maximized");
            options.addArguments("--incognito");
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("Edge")) {

            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/test/resources/executables/EdgeDriver");

             driver = new EdgeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/executables/FirefoxDriver");

            driver = new FirefoxDriver();
        }else {
            driver = new FirefoxDriver();
        }

        return driver;
    }



    @Override
    public boolean takesScreenshots() {
        return true;
    }




}