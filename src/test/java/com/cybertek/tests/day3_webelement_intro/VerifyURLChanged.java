package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLChanged {
    /**Verify URL changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     *
     */
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");


        WebElement emailInput=driver.findElement(By.name("email"));
        //sendKeys() --> send keybord actions to webelement/enters given text
        emailInput.sendKeys("email@gmail.com");

        //locate to pasword button ***
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

      String expectedUrl="http://practice.cybertekschool.com/email_sents";

        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println(expectedUrl+"PASS");
        }else{
            System.out.println(actualUrl+"FAIL");
            System.out.println("expectedUrL+ "+expectedUrl);
            System.out.println("actualUrl+ "+actualUrl);
        }
        driver.quit();
    }
}
