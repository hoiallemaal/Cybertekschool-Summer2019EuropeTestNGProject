package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

  /*  @FindBys({
            @FindBy(id = "_username"),
            @FindBy(xpath = "prependedInput2")

    })
    public  WebElement username2;*/

    //same with driver.findElement(By.id("prependedInput"));
    @FindBy(name = "_username")
    public WebElement usernameInput;
    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;
    @FindBy(id = "_submit")
    public WebElement loginBtn;

    // forget username added
    @FindBy(xpath = "//*[@id='login-form']/fieldset/div[3]/a")
    public WebElement forget;




    public void login(String usernameStr, String passwordStr) {
        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();

    }
}