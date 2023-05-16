package com.luma.cucumber.steps;

import com.luma.pages.HomePage;
import com.luma.pages.JacketsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

public class WomenSteps {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I mouse hover on Women Menu$")
    public void iMouseHoverOnWomenMenu() {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("^I mouse hover on Tops$")
    public void iMouseHoverOnTops() {
        new HomePage().mouseHoverOnTopMenu();
    }

    @And("^I click on Jackets$")
    public void iClickOnJackets() {
        new HomePage().clickOnJacketsLink();
    }

    @And("^I select sort By filter \"([^\"]*)\"$")
    public void iSelectSortByFilter(String arg0)  {
        new JacketsPage().sortByProductName();


    }

    @Then("^I verify the products name display in alphabetical order$")
    public void iVerifyTheProductsNameDisplayInAlphabeticalOrder() {
        ArrayList<String> expectedProductsName = new JacketsPage().getProductsNameByAscendingOrder();
        ArrayList<String> actualProductsName = new JacketsPage().getActualProductsNameByOrder();
        Assert.assertEquals(actualProductsName, expectedProductsName);
    }

    @And("^I Select Sort By filter Price$")
    public void iSelectSortByFilterPrice() {
        new JacketsPage().sortByPrice();
    }

    @Then("^I should verify the products price display in  Low to High$")
    public void iShouldVerifyTheProductsPriceDisplayInLowToHigh() {
        ArrayList<String> actualPrice = new JacketsPage().getActualProductsPriceByOrder();
        ArrayList<String> expectedPrice = new JacketsPage().getProductsPriceByAscendingOrder();
        Assert.assertEquals(actualPrice, expectedPrice);
    }

}
