package com.luma.pages;


import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BagsPage extends Utility {

    private static final Logger log = LogManager.getLogger(BagsPage.class.getName());

    public BagsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Overnight Duffle')]")
    WebElement overNightDuffleLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement overNightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityTextField;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCartButton;


    public void selectOvernightDuffle() {
        log.info("Clicking on OvernightDuffle " + overNightDuffleLink.toString());
        clickOnElement(overNightDuffleLink);

    }

    public String getTextOvernightDuffle() {
        log.info("Get OvernightDuffle Text  " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);

    }

    public void addQuantity() {
        log.info("Add Quantity " + quantityTextField.toString());
        sendTextToElement(quantityTextField, "3");
    }

    public void clickOnOvernightDuffleAddToCart() {
        log.info("Clicking on Add to cart " + addToCartButton.toString());
        clickOnElement(addToCartButton);

    }
}
