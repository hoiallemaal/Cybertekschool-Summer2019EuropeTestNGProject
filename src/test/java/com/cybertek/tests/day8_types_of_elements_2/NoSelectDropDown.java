package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropDown {

    @Test
    public void test1()    {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownelement=driver.findElement(By.id("dropdownMenuLink"));
       //Select links=new Select(dropdownelement);

        //open the dropdown
        dropdownelement.click();

       List<WebElement> listoflinks = driver.findElements(By.className("dropdown-item"));
        System.out.println(listoflinks.size());
        //print the text of each

        
        System.out.println(listoflinks.get(0).getText());

        for (WebElement listoflink : listoflinks) {
            System.out.println(listoflink.getText());
        }

     //  driver.findElements(By.linkText("Yahoo")).click();   click te sorun cikti bak tekrar

        listoflinks.get(3).click();
    }

}
