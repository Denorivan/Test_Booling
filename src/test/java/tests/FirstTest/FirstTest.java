package tests.FirstTest;

import org.testng.annotations.Test;
import tests.BaseTest.BaseTest;

import static tests.constans.Constant.UrlVariable.MAIN_PAGE_OF_BOOKING;

public class FirstTest extends BaseTest {

@Test
    public void CheckingTheCItyInEachCard(){
        basePage.open(MAIN_PAGE_OF_BOOKING);

        mainPage
                .changeLanguagesOnEnGb()
                .enterCity("New York")
                .enterDayToStay()
                .pressSearch();

        searchingPage
                .checkDates()
                .checkCity();


    }

}
