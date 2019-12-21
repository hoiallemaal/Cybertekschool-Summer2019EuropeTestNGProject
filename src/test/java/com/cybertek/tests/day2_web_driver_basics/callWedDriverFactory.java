package com.cybertek.tests.day2_web_driver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class callWedDriverFactory {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.google.com");

    }
}
