package pages;

import Helpers.objetcts.CommonPageObjects;
import Helpers.objetcts.FlightData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class ReservePage extends CommonPageObjects {

    WebDriver driver;
    Integer randomFlight;

    By resultsBody = By.xpath("//table/tdbody");
    By fromPort = By.className("fromPort");
    By toPort = By.className("toPort");

    private int flights = 0;
    private int selected = 0;

    public ReservePage(WebDriver driver) {
        this.driver = driver;
        randomFlight = new Random().nextInt(flights);
    }

    public void chooseFlightAndClickButton() {
        getFlightsNumber();
        selectRandomRow();
        getFlightData();
        clickSelectFlightButton();
    }

    FlightData getFlightData() {
        String resultRow = "//table/tdbody/tr[" + selected + "]=td[";

        FlightData flightData = new FlightData();
        flightData.flightNumber = Integer.getInteger(driver.findElement(By.xpath(resultRow + 2 + "]")).getText());
        flightData.airline = driver.findElement(By.xpath(resultRow + 3 + "]")).getText();
        flightData.departTime = driver.findElement(By.xpath(resultRow + 4 + "]")).getText();
        flightData.arriveTime = driver.findElement(By.xpath(resultRow + 5 + "]")).getText();
        flightData.price = Double.parseDouble(driver.findElement(By.xpath(resultRow + 6 + "]")).getText());
        return flightData;
    }

    private void getFlightsNumber() {
        flights = driver.findElements(resultsBody).size();
    }

    private void selectRandomRow() {
         selected = new Random().nextInt(flights);
    }

    private void clickSelectFlightButton() {
        String selectedButtonString = "//table/tbody/tr[2]/td[" +  selected + "]";
        By selectedButton = By.xpath(selectedButtonString);
        driver.findElement(selectedButton).click();
    }

}
