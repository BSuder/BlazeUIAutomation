package Helpers;

import Helpers.objetcts.PurchaseData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.ReservePage;

public class Pages {

    private WebDriver driver;
    private PurchaseData purchaseData;

    private MainPage mainPage;
    private ReservePage reversePage;

    public Pages() {
        driver = new ChromeDriver();
        purchaseData = new PurchaseData();

        mainPage = new MainPage(driver);
        reversePage = new ReservePage(driver);
    }

    MainPage getMainPage() {
        return this.mainPage;
    }

    ReservePage getReversePage() {
        return this.reversePage;
    }

}
