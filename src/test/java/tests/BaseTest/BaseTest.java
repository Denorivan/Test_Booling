package tests.BaseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import tests.common.Actions;
import tests.pages.Pages.AttractionsListing;
import tests.pages.Pages.AttractionsPage;
import tests.pages.Pages.MainPage;
import tests.pages.Pages.SearchingPage;
import tests.pages.base.BasePage;

import static tests.common.Config.BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = Actions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MainPage mainPage = new MainPage(driver);
    protected SearchingPage searchingPage = new SearchingPage(driver);
    protected AttractionsPage attractionsPage = new AttractionsPage(driver);
    protected AttractionsListing attractionsListing = new AttractionsListing(driver);


    @AfterSuite (alwaysRun = true)
    public void close(){
        if (BROWSER_OPEN){
            driver.quit();
        }
    }
}
