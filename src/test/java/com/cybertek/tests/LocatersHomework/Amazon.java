package com.cybertek.tests.LocatersHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        driver.get("https://www.ebay.com");

        WebElement ebaysearch=driver.findElement(By.id("gh-ac"));
        ebaysearch.sendKeys("auto");

        WebElement clickebay=driver.findElement(By.id("gh-btn"));
        clickebay.click();

        WebElement ebayresult=driver.findElement(By.tagName("h1"));
        System.out.println(ebayresult.getText());

        driver.quit();
    }
}
