package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {
    //we do not need to create constructor and us pagefactory class here,
    //since we are extending from basepage

    //*[contains(text(),'mbrackstone9@example.com')]
    //*[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']
    //*[contains(text(),'mbrackstone9@example.com')and@data-column-label='Email']


    //if you are trying to come up dynamic xpath you can not use@findby
    @FindBy(xpath = " //*[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
    public WebElement emailss;


        //create a method that accepts email as a String, and returns webelement based on

    public WebElement getContactEmail (String  email){
        String emailXpath = "//*[contains(text(),'"+email+"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(emailXpath));

    }


}
