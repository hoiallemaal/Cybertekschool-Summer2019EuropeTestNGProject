package com.cybertek.tests.day7_TestNg;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BeforeAndAfterTest {

    @Test
    public void Test1()  {

        System.out.println("This is my Test 1");
            // beginning of the each test
        //get driver
        // maximize browser
        //open browser.
        //

    }
    @Test
    public void Test2(){

        System.out.println("This is my Test 2");
    }
    @Test
    public void Test3(){
        System.out.println("This is my Test 3");
        }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println("OPEBNING THE BROWSER");

    }
    @AfterMethod
    public void  tearDown(){
        System.out.println("Close Browser");

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS CODE");

    }
    @AfterClass
    public void Afteclass(){
        System.out.println("AFTER CLASS CODE");
        System.out.println("REPORTING");
    }
}
