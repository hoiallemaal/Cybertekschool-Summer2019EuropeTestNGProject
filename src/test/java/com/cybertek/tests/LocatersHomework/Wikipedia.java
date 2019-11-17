package com.cybertek.tests.LocatersHomework;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wikipedia {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.wikipedia.org");

       WebElement searchwiki=driver.findElement(By.id("searchInput"));
       searchwiki.sendKeys("selenium webdriver");

       WebElement clickwikisearch=driver.findElement(By.xpath("//button/i"));
       clickwikisearch.click();

       WebElement clickselenium=driver.findElement(By.xpath("//ul/li/div/a"));
       clickselenium.click();

        System.out.println(driver.getCurrentUrl());

    }
}
