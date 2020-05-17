package stepdefinitons;

import Helpers.enums.DepartureCities;
import Helpers.enums.DestinationCities;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import Helpers.Pages;

public class MainPageDefinitions extends Pages {

    @Given("I have open main page")
    public void  iHaveOpenMainPage() {
        mainPage.openMainPage();
    }

    @When("I click 'home' button")
    public void iClickHomeButton() {
        mainPage.clickHomeButton();
    }

    @When("I select random departure city")
    public void iSelectRandomDepartureCity() {
        mainPage.selectDepartureCityByName(DepartureCities.getRandomCity());
    }

    @When("I select random destination city")
    public void iSelectRandomDestinationCity() {
        mainPage.selectDestinationCityByName(DestinationCities.getRandomCity());
    }

    @Then("I click submit button")
    public void iClickSubmitButton() {
        mainPage.clickSubmitButton();
    }

}
