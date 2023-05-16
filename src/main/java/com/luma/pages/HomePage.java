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

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenLink;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]")
    WebElement topLink;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jacketLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearLink;

    @CacheLookup
    @FindBy(xpath ="/html/body/div[1]/div/div/div[2]/nav/ul/li[4]/ul/li[1]/a/span")
    WebElement bagLink;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menLink;

    @CacheLookup
    @FindBy(linkText = "Bottoms")
    WebElement bottomLink;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantLink;

    public void mouseHoverOnWomenMenu() {
        log.info("MouseHover on Women Menu " + womenLink.toString());
        mouseHoverToElement(womenLink);

    }

    public void mouseHoverOnTopMenu() {
        log.info("MouseHover on Top Menu " + topLink.toString());
        mouseHoverToElement(topLink);

    }

    public void clickOnJacketsLink() {
        log.info("Clicking on jacket link " + jacketLink.toString());
        clickOnElement(jacketLink);

    }

    public void mouseHoverOnGear() {
        log.info("MouseHover on Gear Menu " + gearLink.toString());
        mouseHoverToElement(gearLink);
    }

    public void clickOnBagLink() {
       log.info("Clicking on bag link " + bagLink.toString());
        clickOnElement(bagLink);

    }

    public void mouseHoverMenMenu() {
        log.info("MouseHover on men Menu " + menLink.toString());
        mouseHoverToElement(menLink);

    }

    public void mouseHoverOnBottoms() {
       log.info("MouseHover on bottoms Menu " + bottomLink.toString());
        mouseHoverToElement(bottomLink);

    }

    public void clickOnPantLink() {
        log.info("Clicking on pant link " + pantLink.toString());
        clickOnElement(pantLink);

    }
}
