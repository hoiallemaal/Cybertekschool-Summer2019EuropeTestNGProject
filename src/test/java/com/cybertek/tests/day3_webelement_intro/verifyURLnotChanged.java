package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    /**
     * Verify URL not changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     * click on Retrieve password
     * verify that url did not change
     *
     */
    public static void main(String[] args) {
     // open chrome
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save url to string variable
        String expectedUrl=driver.getCurrentUrl();


        // click on retrieve password
        //web element--> class that represents elements on the web page.
        //findElement__> method used to
        WebElement retreivePasswordButton = driver.findElement(By.id("form_submit"));
        retreivePasswordButton.click();

        // save url to string variable
        String actualUrl=driver.getCurrentUrl();


        //verify that url is not change

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");


        }
        driver.quit();
    }
}
