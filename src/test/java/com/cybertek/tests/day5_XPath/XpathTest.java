package com.cybertek.tests.day5_XPath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.get("https://www.amazon.com");

       WebElement homeLink= driver.findElement(By.xpath("/html/body/nav/ul/li/a"));

        WebElement button=driver.findElement(By.xpath("//button[@onclick='button5()']"));
        button.click();

        WebElement amazonselenium=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        amazonselenium.sendKeys("samsung s8");

        WebElement searchamazon=driver.findElement(By.xpath("//input[@class='nav-input']"));
        searchamazon.click();

            driver.quit(); //
    }
}
