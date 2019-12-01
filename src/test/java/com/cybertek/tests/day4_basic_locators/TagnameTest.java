package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagnameTest {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement fullnameInput=driver.findElement(By.tagName("input"));
        fullnameInput.sendKeys("Mike Smith with Tagname");

        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("mikesmith@email.com");

        WebElement signUpButton=driver.findElement(By.tagName("button"));
        signUpButton.click();

        WebElement messagelast=driver.findElement(By.tagName("h3"));
        String abc= messagelast.getText();
        System.out.println(abc);

        System.out.println(driver.findElement(By.tagName("h3")).getText());   //het zelfde.


}
}
