package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1(){


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement radioButton=driver.findElement(By.id("blue"));
        radioButton.getAttribute("value");

        // get the value of name attribute
        System.out.println(radioButton.getAttribute("name"));
        // get the value of id attribute
        System.out.println(radioButton.getAttribute("id"));

        // get the value of type attribute
        System.out.println(radioButton.getAttribute("type"));

     // trying to get attribute does not exist  (it does not give me error. it give null)
        System.out.println(radioButton.getAttribute("href"));

        //attiribute without value (checked), checked attribute value is boolean. if it is checked it is true
        System.out.println(radioButton.getAttribute("checked"));

        //"outerHTML" returns full html of that element
        System.out.println(radioButton.getAttribute("outerHTML"));





    }
}

