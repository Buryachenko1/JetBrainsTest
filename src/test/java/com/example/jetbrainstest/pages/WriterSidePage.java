package com.example.jetbrainstest.pages;


import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page url = https://www.jetbrains.com/writerside/
public class WriterSidePage {
    public final Logger LOG = LoggerFactory.getLogger(WriterSidePage.class);
    WebDriver driver;

    @FindBy(css = "button[data-jetbrains-cookies-banner-action='ACCEPT_ALL']")
    private WebElement acceptCookieButton;

    @FindBy(css = "a[data-test='button'][href='/writerside/download/']")
    private WebElement downloadButton;


    @FindBy(xpath = "//a[@href='/writerside/buy/']")
    public WebElement pricingButton;

    // Constructor
    public WriterSidePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Accept Cookies
    @Step("Accept Cookies")
    public void acceptCookies() {
        acceptCookieButton.click();
        LOG.info("Cookies accepted");
    }

    // Check if the Download button is enabled
    public Boolean isDownloadButtonEnabled() {
        LOG.info("Checking if the Download button is active");
        return downloadButton.isEnabled();
    }


    // Check if the Pricing button is enabled
    public Boolean isPricingButtonEnabled() {
        return pricingButton.isEnabled();
    }
}