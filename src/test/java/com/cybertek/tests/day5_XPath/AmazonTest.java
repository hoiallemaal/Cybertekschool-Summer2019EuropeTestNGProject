package com.cybertek.tests.day5_XPath;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {





                WebDriver driver = WebDriverFactory.getDriver("chrome");
                driver.manage().window().maximize();
                driver.get("http://practice.cybertekschool.com/multiple_buttons");
                driver.get("https://www.amazon.com");


                WebElement amazonselenium = driver.findElement(By.id("twotabsearchtextbox"));
                amazonselenium.sendKeys("samsung s8");

                Thread.sleep(2000);

                WebElement searchamazon = driver.findElement(By.xpath("//input[@class='nav-input']"));
                searchamazon.click();

              // String resultMessage = driver.findElement(By.xpath("(//span[@dir='auto'])[1]"));

               //System.out.println(resultMessage);
            }
}