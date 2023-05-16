package com.luma.pages;


import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverNightDufflePage extends Utility {
    private static final Logger log = LogManager.getLogger(OverNightDufflePage.class.getName());

    public OverNightDufflePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement overnightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartButton;

    @CacheLookup
    @FindBy(xpath = "//tbody[1]/tr[1]/td[1]/div[1]/strong[1]/a[1]")
    WebElement OvernightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='field qty']//input")
    WebElement quantityTextField;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$135.00')]")
    WebElement priceTextField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='cart-106590-qty']")
    WebElement quantityAddTextField;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$225.00')]")
    WebElement priceTextField2;


    public String getTextOvernightDuffle() {
        log.info("Get OvernightDuffle Text  " + overnightDuffleText.toString());
        return getTextFromElement(overnightDuffleText);
    }

    public void clickOnShoppingCartButton() {
        log.info("Clicking on Continue Button " + shoppingCartButton.toString());
        clickOnElement(shoppingCartButton);

    }

    public String getTextCronusYogaPant() {
        log.info("Get Account Has Been Created  text  " + overnightDuffleText.toString());
        return getTextFromElement(overnightDuffleText);

    }

    public String getTextOfQuantityThree() {
        log.info("get text quantity  " + quantityTextField.toString());
        return getTextFromElement(quantityTextField);

    }

    public String getTextOfPrice$13500() {
        log.info("get text price$13500  " + priceTextField.toString());
        return getTextFromElement(priceTextField);
    }

    public void addQuantityTo5() {
        log.info("Add quantity  " + quantityAddTextField.toString());
        sendTextToElement(quantityAddTextField, "5");

    }

    public String getPrice$22500() {
        log.info("get text price$22500  " + priceTextField.toString());
        return getTextFromElement(priceTextField2);

    }
}
