package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {
    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 1. locate the dropdown element with unique locator
        WebElement dropdownElement=driver.findElement(By.id("state"));

        // create Select object by passing the element as a constructor

        Select stateList=new Select(dropdownElement);

        // getOptions--> get all the avaliable options from dropdown list
       List<WebElement> options=stateList.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());

        }



    }
    @Test
    public void test2() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 1. locate the dropdown element with unique locator
        WebElement dropdownElement=driver.findElement(By.id("state"));

        // create Select object by passing the element as a constructor

        Select stateList=new Select(dropdownElement);

        //verify that first option is "Select the State"

        String expectedOption="Select a State";
        String actualOption =stateList.getFirstSelectedOption().getText();

        System.out.println(actualOption);

        Assert.assertEquals(actualOption,expectedOption,"verify first selection is select a state");

        //how to select OPTIONS from dropdown. we are gonna learn 3 ways.
        //1. using visible text
        Thread.sleep(2000);

        //selecting Texas from the list
        stateList.selectByVisibleText("Texas");
        actualOption=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,"Texas");

        //2. using index number
        Thread.sleep(2000);
        stateList.selectByIndex(51);
        actualOption=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,"Wyoming");

        //3. Using valuee
        Thread.sleep(2500);

        stateList.selectByValue("SC");
        actualOption=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,"South Carolina");

    }
}
