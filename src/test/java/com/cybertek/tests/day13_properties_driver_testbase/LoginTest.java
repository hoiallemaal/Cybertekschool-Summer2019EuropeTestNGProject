package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {



    @Test
    public void test1(){
        driver.get(ConfigurationReader.get("url"));
        driver.findElement(By.id("prependedInput")).sendKeys("user1");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");


    }

}
