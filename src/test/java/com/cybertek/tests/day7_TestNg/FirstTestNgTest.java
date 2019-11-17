package com.cybertek.tests.day7_TestNg;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirstTestNgTest {

       // WebDriver driver= WebDriverFactory.getDriver("chrome");
        @Test
        public void test1() {
            System.out.println("My first TestNG Test");

        }
        @Test
        public void test2(){
            System.out.println("My second TestNG Test");

        }

}
