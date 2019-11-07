package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocaterTest {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");

       // WebElement Home=driver.findElement(By.tagName("a"));
       // Home.click();

        WebElement Home1=driver.findElement(By.className("nav-link"));
        Home1.click();

        driver.get("https://practice.cybertekschool.com/multiple_buttons");

        WebElement multiple=driver.findElement(By.className("h3"));
        String abc=multiple.getText();
        System.out.println(abc);

        System.out.println(driver.findElement(By.className("h3")).getText());  // het zelfde

        //note: if there is a space in the class attribute name we can not use class.
    }
}
