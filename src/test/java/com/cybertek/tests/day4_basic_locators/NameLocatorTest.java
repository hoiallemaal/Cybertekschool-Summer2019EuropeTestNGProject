package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement fullnameInput=driver.findElement(By.name("full_name"));
        fullnameInput.sendKeys("Mike Smith");

        WebElement secretemail=driver.findElement(By.name("email"));
        secretemail.sendKeys("secretemail@gmail.com");

        WebElement clicksignUp=driver.findElement(By.name("wooden_spoon"));
        clicksignUp.click();

        //verify that you got the correct message.

        String expected_mes="Thank you for signing up. Click the button below to return to the home page.";

        WebElement actualmessage=driver.findElement(By.name("signup_message"));
        String actualMessage = actualmessage.getText();

        if(expected_mes.equals(actualMessage)){
            System.out.println("PASS");
        }else{

            System.out.println("FAIL");
            System.out.println("Expected message"+ expected_mes);
            System.out.println("Actual Message"+actualMessage);
        }
        driver.quit();
    }

}
