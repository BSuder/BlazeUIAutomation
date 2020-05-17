package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverHelper {

    WebDriver driver;

    void setChromeDriver() {
        driver = new ChromeDriver();
    }

    ChromeOptions setHeadLess(WebDriver driver) {
        ChromeOptions options = new ChromeOptions().addArguments("--headless");
        return options;
    }

    ChromeOptions setFullHDResolution() {
        ChromeOptions options = new ChromeOptions().addArguments("--window-size=1920x1080");
        return options;
    }

}
