package com.cybertek.tests.day2_web_driver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       driver.get("https://practice.cybertekschool.com");
        Thread.sleep(3000);
        //close() --> closes the current tab
       driver.close();


       // we use only driver because it has declared before in the same page
        driver=new ChromeDriver();

        driver.get("https:practice.cybertekschool.com/open_new_tab");
        Thread.sleep(5000);

        // the difference between close and quit. quit: closes all open windows and tabs and pop ups etc.
        // close ; only close the new page that has opened
        driver.quit();
    }
}
