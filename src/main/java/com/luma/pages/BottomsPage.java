package com.luma.pages;

import com.aventstack.extentreports.Status;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class BottomsPage extends Utility {
    private static final Logger log = LogManager.getLogger(BottomsPage.class.getName());

    public BottomsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Cronus Yoga Pant')]")
    WebElement cronusYogaPantLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")
    WebElement sizeTextField;

    @CacheLookup
    @FindBy(xpath = "(//div[@role='alert']//div)[2]")
    WebElement pantsAddedToCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPantTitle;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSizeTextField;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColourText;




     public void mouseHoverOnCronusYogaPant() {
        Reporter.log("MouseHover on CronusYogaPant link " + cronusYogaPantLink.toString());
        mouseHoverToElement(cronusYogaPantLink);

    }

    public void clickOnSize() {
        Reporter.log("Clicking on Size  Link " + sizeTextField.toString());
        clickOnElement(sizeTextField);


    }

    public String getTextPantsAddedToCart() {
        Reporter.log("Get Pants Added To Cart  text  " + pantsAddedToCartText.toString());
        return getTextFromElement(pantsAddedToCartText);
       // CustomListeners.test.log(Status.PASS,"pants added to cart");
    }

    public String getTitleCronusYogaPant() {
        return getTextFromElement(cronusYogaPantTitle);
    }

    public String gettextToCheckSizeOfProduct() {
        Reporter.log("Get Pants Added To Cart  text  " + pantsAddedToCartText.toString());
        return getTextFromElement(productSizeTextField);

    }

    public String getTextToCheckColourOfProduct() {
        Reporter.log("Get Text check colour  of product " + pantsAddedToCartText.toString());
        return getTextFromElement(productColourText);

    }

}

