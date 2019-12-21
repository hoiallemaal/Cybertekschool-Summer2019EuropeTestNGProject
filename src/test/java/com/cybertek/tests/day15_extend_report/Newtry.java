package com.cybertek.tests.day15_extend_report;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class Newtry extends TestBase {
    LoginPage log=new LoginPage();
    String a=  ConfigurationReader.get("storemanager_username");
    String b= ConfigurationReader.get("storemanager_password");


    @Test
    public  void test1(){


        log.forget.click();



    }
    @Test
    public void test2(){

//        log.usernameInput.sendKeys("user1");
//        log.passwordInput.sendKeys("UserUser123");
//        log.loginBtn.click();

     //   log.login("user1","UserUser123");

      //  ConfigurationReader con=new ConfigurationReader();



    //  log.login(ConfigurationReader.get("driver_username"),ConfigurationReader.get("driver_password"));
        extentLogger = report.createTest("Wrong Password Test");
        extentLogger.info("Click login button");
        log.login(a,b);
        System.out.println("gdgh");
}
    @Test
    public void test3(){

        extentLogger = report.createTest("Create  page");
        extentLogger.info("Click login button");
        log.login(a,b);


        DashboardPage ccalender=new DashboardPage();
        ccalender.gotocalender();


    }
}
