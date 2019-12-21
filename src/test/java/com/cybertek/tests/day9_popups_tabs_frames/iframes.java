package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframes {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

             }
    @Test
    public void test1() throws InterruptedException {

    driver.get("http://practice.cybertekschool.com/iframe");

    //how to switch frames
        //switch by using id or name atiribute of frame
        driver.switchTo().frame("mce_0_ifr");
        //before sending massege we can clear the default
        driver.findElement(By.id("tinymce")).clear();
    //locate and send some elements
    driver.findElement(By.id("tinymce")).sendKeys("Test Text");
    Thread.sleep(2000);
    // how we are gonna switch back, there are two ways. this is useful for more than two frames.
        driver.switchTo().defaultContent();
        //2. using index.

        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).sendKeys("nfkdnkndkn");
        //go back to first frame, only to parent
        driver.switchTo().parentFrame();

        //using webelement
        //locating
        WebElement frameElement=driver.findElement(By.tagName("iframe"));
        //passing frame aas a web element
        driver.switchTo().frame(frameElement);
    }
    @Test
    public void multipleFrames(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
        //switching to frame top
        driver.switchTo().frame("frame-top");
        //switching to middle frame
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());
        //go back to parent to switch right

        driver.switchTo().parentFrame();

        //switching right using index
        driver.switchTo().frame(2);

        //print right from right frame
        System.out.println(driver.findElement(By.tagName("body")).getText());

        //go up to top levelhtml directly

        driver.switchTo().defaultContent();

        //switch to frame bottom

        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());

        //switch to left
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.xpath("//body")).getText());
    }
}
