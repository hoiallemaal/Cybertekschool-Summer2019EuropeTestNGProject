package com.cybertek.tests.day11_actions_jsexecutor;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

    //hover over each image in the website
    //verify each name:user text is displayed
    @Test
    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");

        for (int i = 1; i <4 ; i++) {

            String imageXpath="(//img)["+i+"]";

            WebElement img=driver.findElement(By.xpath(imageXpath));

            Actions actins=new Actions(driver);

            Thread.sleep(1000);

            actins.moveToElement(img).perform();

            String textXpath="(//h5)["+i+"]";

            WebElement text =driver.findElement(By.xpath(textXpath));

            Assert.assertTrue(text.isDisplayed());
        }


    }
}
