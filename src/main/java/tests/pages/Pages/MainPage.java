package tests.pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By languagesSelection = By.xpath("//button[@data-modal-id=\"language-selection\"]");
    private final By languagesChange = By.xpath("//a[@data-lang=\"en-gb\"]");
    private final By inputCity = By.xpath("//body//form//div//div//label//input");
    private final By findDays = By.xpath("//div[@class=\"xp__fieldset js--sb-fieldset accommodation \"]//div[@class=\"xp__dates xp__group\"]//div//div//div//div");
    private final By scrollMonths = By.xpath("//div[@class=\"bui-calendar__control bui-calendar__control--next\"]");
    private final By firstDay = By.xpath("//td[@data-date=\"2022-12-01\"]");
    private final By lastDaY = By.xpath("//td[@data-date=\"2022-12-31\"]");
    private final By searchButton = By.cssSelector(".sb-searchbox__button");
    private final By attractions = By.xpath("//a[@data-decider-header=\"attractions\"]");

    public MainPage changeLanguagesOnEnGb(){
        driver.findElement(languagesSelection).click();
        driver.findElement(languagesChange).click();

        return this;
    }

    public MainPage enterCity(String str) {
        driver.findElement(inputCity).sendKeys(str);
        return this;
    }

    public MainPage enterDayToStay(){
        driver.findElement(findDays).click();
        driver.findElement(scrollMonths).click();
        driver.findElement(scrollMonths).click();
        driver.findElement(firstDay).click();
        driver.findElement(lastDaY).click();
        return this;
    }


    public MainPage pressSearch(){
        driver.findElement(searchButton).click();
        return this;
    }

    public MainPage pressAttractions(){
        driver.findElement(attractions).click();
        return this;
    }


}
