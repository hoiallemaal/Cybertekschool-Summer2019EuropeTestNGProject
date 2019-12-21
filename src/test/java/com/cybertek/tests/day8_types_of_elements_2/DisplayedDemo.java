package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {


    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput=driver.findElement(By.id("username"));

            //isDisplayed()--> if the ellement is in the html code, but not displayed
        // return true if it is visible on the page. false if it is not visible, you have to locate the element succesfully to use thismethod. we can not
        //
        System.out.println(usernameInput.isDisplayed());

        Assert.assertFalse(usernameInput.isDisplayed(),"verify that usernameinput is not displayed");

        WebElement clickStart=driver.findElement(By.xpath("//button"));  //#start>button by css b

        clickStart.click();
        Thread.sleep(5000);
        System.out.println(usernameInput.isDisplayed());

    }
}
