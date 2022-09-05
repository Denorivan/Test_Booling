package tests.SecondTest;

import org.testng.annotations.Test;
import tests.BaseTest.BaseTest;

import static tests.constans.Constant.UrlVariable.MAIN_PAGE_OF_BOOKING;

public class SecondTest extends BaseTest {

    @Test
    public void CheckingFreeCancellationAvailable(){
        basePage.open(MAIN_PAGE_OF_BOOKING);

        mainPage
                .changeLanguagesOnEnGb()
                .pressAttractions();

        attractionsPage
                .enterCity("London, Greater London")
                .search();

        attractionsListing
                .searchAttractions("Harry Potter");

        driver.quit();

    }
}
