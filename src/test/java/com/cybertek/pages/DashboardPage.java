package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {
   /* public DashboardPage() {PageFactory.initElements(Driver.get(), this);

    }*/   //no need to explicitly write constructors, because it will use its parents constructor

    //find locaters of activity
    @FindBy(xpath = "(//li/a/span)[17]")
    public WebElement activityInDashboard;

    //find the locaters of calender
   @FindBy(xpath = " (//li/a/span)[19]")
    public WebElement CalenderInDashboard;


   //write a method to click activity and calender
   public void gotocalender(){
       activityInDashboard.click();
       CalenderInDashboard.click();



   }
}

