package com.cybertek.tests.LocatersHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ebay {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com");

        WebElement ebaysearch=driver.findElement(By.id("gh-ac"));
        ebaysearch.sendKeys("samsung s");
        WebElement ebaysearchclick=driver.findElement(By.id("gh-btn"));
        ebaysearchclick.click();

        WebElement ebayresult=driver.findElement(By.tagName("h1"));
        System.out.println(ebayresult.getText());


    }
}
