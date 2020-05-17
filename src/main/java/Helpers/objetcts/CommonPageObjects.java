package Helpers.objetcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPageObjects {

    WebDriver driver;

    By homeButton = By.linkText("home");
    By travelThwWorldButton = By.linkText("Travel THe World");

    void clickTravelTheWorldButton() {
        driver.findElement(travelThwWorldButton).click();
    }

    void clickHomeButton() {
        driver.findElement(homeButton).click();
    }

}
