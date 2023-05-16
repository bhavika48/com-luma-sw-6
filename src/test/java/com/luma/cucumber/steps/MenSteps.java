package com.luma.cucumber.steps;

import com.luma.pages.BottomsPage;
import com.luma.pages.HomePage;
import com.luma.pages.OverNightDufflePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenSteps {
    @When("^I mouse hover on Men Menu$")
    public void iMouseHoverOnMenMenu() {
        new HomePage().mouseHoverMenMenu();
    }

    @And("^I mouse Hover on Bottoms$")
    public void iMouseHoverOnBottoms() {
        new HomePage().mouseHoverOnBottoms();
    }

    @And("^I click on Pants$")
    public void iClickOnPants() {
        new HomePage().clickOnPantLink();
    }


    @And("^I mouse Hover on product name$")
    public void iMouseHoverOnProductName() {
        new BottomsPage().mouseHoverOnCronusYogaPant();
    }

    @And("^Cronus Yoga Pant and click on size \"([^\"]*)\"$")
    public void cronusYogaPantAndClickOnSize(String arg0) {
        new BottomsPage().clickOnSize();

    }

    @And("^I mouse hover on product name Cronus Yoga Pant and click on colour  Black\\.$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new BottomsPage().mouseHoverOnCronusYogaPant();

    }

    @And("^I 'Cronus Yoga Pant' and click on colour Black\\.$")
    public void iCronusYogaPantAndClickOnColourBlack() {

    }

    @And("^I mouse Hover on product name 'Cronus Yoga Pant' and click on Add To Cart button$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {

    }

    @And("^I verify the text 'You added Cronus Yoga Pant to your shopping cart'$")
    public void iVerifyTheTextYouAddedCronusYogaPantToYourShoppingCart() {
        new BottomsPage().getTextPantsAddedToCart();
    }

    @And("^I click on 'shopping cart' Link into message$")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new OverNightDufflePage().clickOnShoppingCartButton();
    }

    @And("^I verify the text 'Shopping Cart'$")
    public void iVerifyTheTextShoppingCart() {
        String expMessage1 = "Cronus Yoga Pant";
        String actualMessage1 = new BottomsPage().getTextPantsAddedToCart();
        Assert.assertEquals(actualMessage1, expMessage1);
    }

    @And("^I verify the product name 'Cronus Yoga Pant'$")
    public void iVerifyTheProductNameCronusYogaPant() {
        new BottomsPage().getTitleCronusYogaPant();
    }

    @And("^I verify the product size ‘(\\d+)’$")
    public void iVerifyTheProductSize(int arg0) {
        String expMessage2 = "32";
        String actualMessage2 = new BottomsPage().gettextToCheckSizeOfProduct();
        Assert.assertEquals(actualMessage2, expMessage2);
    }

    @Then("^I verify the product colour ‘Black’$")
    public void iVerifyTheProductColourBlack() {
        String expMessage3 = "Black";
        String actualMessage3 = new BottomsPage().getTextToCheckColourOfProduct();
        Assert.assertEquals(actualMessage3, expMessage3);
    }
}


