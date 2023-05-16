package com.luma.cucumber.steps;

import com.luma.pages.BagsPage;
import com.luma.pages.HomePage;
import com.luma.pages.OverNightDufflePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {
    @When("^I mouse Hover on Gear Menu$")
    public void iMouseHoverOnGearMenu() {
        new HomePage().mouseHoverOnGear();
    }

    @And("^I click on Bags$")
    public void iClickOnBags() {
        new HomePage().clickOnBagLink();
    }

    @And("^I click on Product Name 'Overnight Duffle'$")
    public void iClickOnProductNameOvernightDuffle() {
        new BagsPage().selectOvernightDuffle();
    }

    @And("^I verify the text 'Overnight Duffle'$")
    public void iVerifyTheTextOvernightDuffle() {
        String expectedMessage = "Overnight Duffle";
        String actualMessage = new BagsPage().getTextOvernightDuffle();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


    @And("^I Change Qty (\\d+)$")
    public void iChangeQty(int arg0) {
        new BagsPage().addQuantity();
    }

    @And("^Iclick on 'Add to Cart' Button$")
    public void iclickOnAddToCartButton() {
        new BagsPage().clickOnOvernightDuffleAddToCart();
    }

    @And("^I verify the text You added Overnight Duffle to your shopping cart'$")
    public void iVerifyTheTextYouAddedOvernightDuffleToYourShoppingCart() {
        String expectedMessage1 = "You added Overnight Duffle to your shopping cart.";
        String actualMessage1 = new OverNightDufflePage().getTextOvernightDuffle();
        Assert.assertEquals(expectedMessage1, actualMessage1);
    }

    @And("^I click on 'shopping cart' Link into  message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new OverNightDufflePage().clickOnShoppingCartButton();
    }

    @Then("^I verify the product name Cronus Yoga Pant$")
    public void iVerifyTheProductNameCronusYogaPant() {
        new OverNightDufflePage().getTextCronusYogaPant();
    }

    @And("^I verify the Qty is '(\\d+)'$")
    public void iVerifyTheQtyIs(int arg0) {
        String expectedMessage3 = "3";
        String actualMessage3 = new OverNightDufflePage().getTextOfQuantityThree();
        Assert.assertEquals(actualMessage3, expectedMessage3);
    }

    @And("^I verify the product price \\$(\\d+)\\.(\\d+) of overnightDuffle$")
    public void iVerifyTheProductPrice$OfOvernightDuffle(int arg0, int arg1) {
        String expectedMessage4 = "$135.00";
        String actualMessage4 = new OverNightDufflePage().getTextOfPrice$13500();
        Assert.assertEquals(actualMessage4, expectedMessage4);
    }


    @And("^I Change Qty to '(\\d+)'$")
    public void iChangeQtyTo(int arg0) {
        new OverNightDufflePage().addQuantityTo5();
    }

    @And("^I click on 'Update Shopping Cart' button$")
    public void iClickOnUpdateShoppingCartButton() {
        new OverNightDufflePage().clickOnShoppingCartButton();
    }

    @Then("^I verify the product price ‘\\$(\\d+)\\.(\\d+)’$")
    public void iVerifyTheProductPrice$(int arg0, int arg1) {
        String expectedMessage5 = "$225.00";
        String actualMessage5 = new OverNightDufflePage().getPrice$22500();
        Assert.assertEquals(actualMessage5, expectedMessage5);

    }

}
