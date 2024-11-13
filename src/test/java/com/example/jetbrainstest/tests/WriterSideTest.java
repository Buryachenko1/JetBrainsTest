package com.example.jetbrainstest.tests;

import com.example.jetbrainstest.pages.WebStormPage;
import com.example.jetbrainstest.pages.WriterSidePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WriterSideTest extends BaseTest {

    private WriterSidePage writerSidePage;

    @BeforeEach
    @Override
    public void setUp() {
        super.setUp();
        getDriver().get("https://www.jetbrains.com/writerside/");
        writerSidePage = new WriterSidePage(getDriver());
        writerSidePage.acceptCookies(); // Accept cookies before proceeding with tests
    }

    @Test
    @DisplayName("Check if Download button is active")
    public void testDownloadButtonIsActive() {
        assertTrue(writerSidePage.isDownloadButtonEnabled(), "Download button is not active");
    }

    @Test
    @DisplayName("Check if Pricing button is enabled")
    public void testPricingButtonIsEnabled() {
        assertTrue(writerSidePage.isPricingButtonEnabled(), "Pricing button is not active");
    }
}
