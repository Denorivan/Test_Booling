package tests.pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.pages.base.BasePage;

public class AttractionsPage extends BasePage {
    public AttractionsPage(WebDriver driver) {
        super(driver);
    }

    private final By inputCity = By.xpath("//input[@type=\"search\"]");
    private final By choose = By.xpath("//li[@class=\"css-9dv5ti\"]");
    private final By pressSearch = By.xpath("//button[@type=\"submit\"]");

    public AttractionsPage enterCity(String str){
        driver.findElement(inputCity).sendKeys(str);
        driver.findElement(choose).click();
        return this;
    }

    public AttractionsPage search(){
        driver.findElement(pressSearch).click();
        return this;
    }

}
