package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.tests.TestBase;
import com.cybertek.utulities.ConfigurationReader;
import com.cybertek.utulities.Driver;
import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {



    @Test
    public void test1(){
        driver.get(ConfigurationReader.get("url"));
        driver.findElement(By.id("prependedInput")).sendKeys("user1");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");


    }

}
