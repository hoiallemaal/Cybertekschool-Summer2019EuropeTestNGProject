package com.cybertek.tests.day10_sync;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
      //  driver.quit();

    }

    @Test
    public void Test1() {
        driver.get("http://practice.cybertekschool.com/upload");
       // driver.findElement(By.name("file")).click();   //we can not do this in selenium

        driver.findElement(By.name("file")).sendKeys("C:\\Users\\Gebruiker\\Desktop\\file.txt");
        driver.findElement(By.id("file-submit")).click();

        String actual= driver.findElement(By.id("uploaded-files")).getText();
        System.out.println(actual);
        String  expected="file.txt";
       // Assert.assertTrue(actual.equals(expected));
        Assert.assertEquals(actual,"file.txt","verify the file name");


    }
}