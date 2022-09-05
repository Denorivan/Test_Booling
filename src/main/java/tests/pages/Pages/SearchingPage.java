package tests.pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.pages.base.BasePage;

import java.util.List;

public class SearchingPage extends BasePage {

    public SearchingPage(WebDriver driver) {
        super(driver);
    }

    private final By city = By.xpath("//span[@data-testid=\"address\"]");
    private final By checkInDate = By.xpath("//button[@data-testid=\"date-display-field-start\"]");
    private final By checkOutDate = By.xpath("//button[@data-testid=\"date-display-field-end\"]");

    public SearchingPage checkCity(){
        List<WebElement> findLocation = driver.findElements(city);
        for (WebElement oneCard:findLocation){
            String address = oneCard.getText();
            if (address.endsWith("New York")){
                System.out.println(address);
                System.out.println("New Yorck is present in card");
            }
        }
        return this;
    }

    public SearchingPage checkDates(){
        WebElement checkDate = driver.findElement(checkInDate);
        String day = checkDate.getText();

        if (day.endsWith("1 December 2022")){
            System.out.println("Correct check in date");
        } else {
            System.out.println("Incorrect check in date");
        }

        checkDate.findElement(checkOutDate);

        if (day.endsWith("1 December 2022")){
            System.out.println("Correct check out date");
        } else {
            System.out.println("Incorrect check out date");
        }
        return this;
    }

}
