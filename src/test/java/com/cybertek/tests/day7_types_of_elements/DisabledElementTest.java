package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementTest {

    @Test
    public  void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/radio_buttons");

        WebElement greenButton=driver.findElement(By.id("green"));

        //how can we check button is enabled or not
        System.out.println("Is element enabled: "+greenButton.isEnabled());
        //verify that green button is disaled
        Assert.assertFalse(greenButton.isEnabled(),"verify that green button is disabled");

        greenButton.click();
    }
    @Test
    public void test2(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("R");
        WebElement inputBox= driver.findElement(By.cssSelector("#input-example>input"));
        System.out.println("is input enabled: "+ inputBox.isEnabled());
        inputBox.sendKeys("Mike Smith");
}

}
