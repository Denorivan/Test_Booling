package tests.pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.pages.base.BasePage;

import java.util.List;

public class AttractionsListing extends BasePage {
    public AttractionsListing(WebDriver driver) {
        super(driver);
    }

    //private final By card = By.xpath("//a[@target=\"_blank\"]");
    private final By attractionName = By.xpath("//h4[@class=\"css-4bo6p0\"]");

    public AttractionsListing searchAttractions(String str){
        List<WebElement> findCard = driver.findElements(attractionName);
        for(WebElement oneAttraction:findCard){
            String nameOfAttraction = oneAttraction.getText();
            if (nameOfAttraction.equals("Harry Potter Tour")){
                System.out.println("Its Harry Potter Tour");
            } else {
                System.out.println("This is not the right tour");
            }
        }
        return this;
    }


}
