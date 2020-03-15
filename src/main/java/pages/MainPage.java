package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By departureCity = By.className("fromPort");
    By destinationCity = By.className("toPort");

    By submitButton = By.className("btn btn-primary");

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
