package pages;

import Helpers.objetcts.CommonPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.PropertyReader;

public class MainPage extends CommonPageObjects {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By homeButton = By.linkText("Travel The World");
    By travelTheWorldButton = By.linkText("home");

    By departureCity = By.className("fromPort");
    By destinationCity = By.className("toPort");

    By submitButton = By.className("btn btn-primary");

    void openMainPage() {
        driver.get(new PropertyReader().getMainPageURL());
    }

    void clickHomeButton() {
        driver.findElement(homeButton).click();
    }

    void clickTravelTheWorldButton() {
        driver.findElement(travelTheWorldButton).click();
    }

    void selectDepartureCityByName(String name) {
        WebElement citiesList = driver.findElement(departureCity);
        citiesList.findElement(By.cssSelector("li[value=" + name + "]")).click();
    }

    void selectDestinationCityByName(String name) {
        WebElement citiesList = driver.findElement(destinationCity);
        citiesList.findElement(By.cssSelector("li[value=" + name + "]")).click();
    }

    void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

}
