package com.cybertek.tests.day2_web_driver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaigationDemo {

    public static void main(String[] args) throws InterruptedException {
        //setting up the browser

        WebDriverManager.chromedriver().setup();

        // import class alt enter

        WebDriver driver = new ChromeDriver();

        // navigate to website
        driver.get("https://www.google.com");
        Thread.sleep(5000);

        driver.navigate().to("http://www.facebook.com");

        driver.navigate().back();
        Thread.sleep(3000);

        // click the forward button on the browser
        driver.navigate().forward();

        // refresh the page
        driver.navigate().refresh();
    }
}
