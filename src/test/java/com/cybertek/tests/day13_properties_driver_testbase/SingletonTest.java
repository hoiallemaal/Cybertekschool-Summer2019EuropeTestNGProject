package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.utulities.ConfigurationReader;
import com.cybertek.utulities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {


     // we use this singleton concept to get
    @Test
    public  void test(){

        String s1=Singleton.getInstance();
        String s2=Singleton.getInstance();

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

    }

    @Test
    public  void test2(){
    // this is how we create web dirver object from now on
        //type of the driver will come from Configuration.properties file
      WebDriver driver= Driver.get();

      //we are getting url from Configuration.properties file
      driver.get(ConfigurationReader.get("url"));

      Driver.get().navigate().refresh();
    }

    @Test
    public void test3() throws InterruptedException {
        Thread.sleep(200);

        Driver.get().get("https://amazon.com");

        // if we are using Driver close, we use closeDriver method to close the driver
        Driver.closeDriver();

    }
}
