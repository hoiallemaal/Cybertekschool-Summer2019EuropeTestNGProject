package com.cybertek.tests.TestCase_4;

import com.cybertek.pages.AllCalenderEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_1 extends TestBase {
    /*Test Case #1
            1. Go to “https://qa1.vytrack.com/"
            2. Login as a store manager
            3. Navigate to “Activities -> Calendar Events”
            4. Hover on three dots “…” for “Testers meeting”
            calendar event
            5.
*/
    @Test
    public void contactDetailsTest() {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as astoremanager");
        loginPage.login(username, password);


        DashboardPage calenderev = new DashboardPage();
        extentLogger.info("go to calender events");
        calenderev.gotocalender();

        // massActions
        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.hover(allCalenderEventsPage.massActions);
        //  BrowserUtils.hover(allCalenderEventsPage.massActions);


    }

    @Test
    public void gridoptions() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as astoremanager");
        loginPage.login(username, password);


        DashboardPage calenderev = new DashboardPage();
        extentLogger.info("go to calender events");
        calenderev.gotocalender();

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();

        Thread.sleep(3000);
        allCalenderEventsPage.gridSettings.click();


    }

    @Test
    public void saveAndClose() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as astoremanager");
        loginPage.login(username, password);


        DashboardPage calenderev = new DashboardPage();
        extentLogger.info("go to calender events");
        calenderev.gotocalender();

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.waitFor(5);
        extentLogger.info("click create calender event");
        allCalenderEventsPage.calendereventbutton();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        BrowserUtils.waitFor(4);
        createCalendarEventsPage.SaveAndClose();
        extentLogger.info("click save and close");

        CreateCalendarEventsPage createCalendarEventsPage1 = new CreateCalendarEventsPage();
        createCalendarEventsPage1.subsaveandclose();
        extentLogger.info("compare actual and expectec save and close subvalues");

    }

    @Test
    public void cancel() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as a storemanager");
        loginPage.login(username, password);


        DashboardPage calenderev = new DashboardPage();
        extentLogger.info("go to calender events");
        calenderev.gotocalender();

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.waitFor(5);
        extentLogger.info("click create calender event");
        allCalenderEventsPage.calendereventbutton();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        BrowserUtils.waitFor(2);
        extentLogger.info("cancel calender event");
        createCalendarEventsPage.Cancel();

        AllCalenderEventsPage allCalenderEventsPage1 = new AllCalenderEventsPage();
        BrowserUtils.waitFor(2);
        extentLogger.info("display all calender events text");
        allCalenderEventsPage1.allcalendertext();
    }

    @Test
    public void differencebetweenStartandEnd() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as a storemanager");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.waitFor(5);
        extentLogger.info("click create calender event");
        allCalenderEventsPage.calendereventbutton();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        BrowserUtils.waitFor(3);
        createCalendarEventsPage.differenceStartandEnd();



    }

    @Test
    public void testcase6() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as a storemanager");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.waitFor(5);
        extentLogger.info("click create calender event");
        allCalenderEventsPage.calendereventbutton();

        CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();
       BrowserUtils.waitFor(2);
      createCalendarEventsPage.startTime.clear();
        extentLogger.info("clean the start time");
      BrowserUtils.waitFor(3);
      createCalendarEventsPage.startTime.sendKeys("9:00 PM");
        extentLogger.info("write a new start time");
      String actual=createCalendarEventsPage.endTime.getAttribute("value");
        extentLogger.info("get the end time");
      Assert.assertEquals(actual,"10:00 PM");
        extentLogger.info("checks the actual end time if it is equal to expected");

      //i have found a bug here. end time does not change althoug i changed the start time


    } @Test
    public void testcase7() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as a storemanager");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.waitFor(5);
        extentLogger.info("click create calender event");
        allCalenderEventsPage.calendereventbutton();

        CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();
        BrowserUtils.waitFor(3);
        createCalendarEventsPage.a_d_event.click();
        BrowserUtils.waitFor(3);
        Assert.assertFalse(createCalendarEventsPage.startTime.isDisplayed(),"verify that start time is not displayed");
        Assert.assertFalse(createCalendarEventsPage.endTime.isDisplayed(),"verify that end time is not displayed");
        BrowserUtils.waitFor(2);
        Assert.assertTrue(createCalendarEventsPage.startDate.isDisplayed(),"verify that start date is not displayed");
        Assert.assertTrue(createCalendarEventsPage.endDate.isDisplayed(),"verify that end date is not displayed");
    }
    @Test
    public void testcase8() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as a storemanager");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.waitFor(5);
        extentLogger.info("click create calender event");
        allCalenderEventsPage.calendereventbutton();

        CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();
        BrowserUtils.waitFor(2);
        createCalendarEventsPage.repeat.click();
        extentLogger.info("click Repeat");
        Assert.assertTrue(createCalendarEventsPage.repeat.isSelected());
        extentLogger.info("verifys that repeat checkbox is selected");

        Assert.assertEquals( createCalendarEventsPage.repeatselect.getAttribute("value"),"daily", "verify that value for repeat is Daily");
        extentLogger.info("verifys that daily is selected as default");

        Select weekly=new Select(createCalendarEventsPage.repeatselect);
        extentLogger.info("select repeats dropdown");
        weekly.selectByIndex(1);
        extentLogger.info("selects weekly in dropdowm");
        Assert.assertEquals( createCalendarEventsPage.repeatselect.getAttribute("value"),"weekly", "verify that value for repeat is Daily");

        Select monthly=new Select(createCalendarEventsPage.repeatselect);
        extentLogger.info("select repeats dropdown");
        weekly.selectByIndex(2);
        extentLogger.info("selects monthly in dropdowm");
        Assert.assertEquals( createCalendarEventsPage.repeatselect.getAttribute("value"),"monthly", "verify that value for repeat is Daily");

        Select yearly=new Select(createCalendarEventsPage.repeatselect);
        extentLogger.info("select repeats dropdown");
        weekly.selectByIndex(3);
        extentLogger.info("selects yearly in dropdowm");
        Assert.assertEquals( createCalendarEventsPage.repeatselect.getAttribute("value"),"yearly", "verify that value for repeat is Daily");



    }
    @Test
    public void testcase9() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as a storemanager");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.waitFor(5);
        extentLogger.info("click create calender event");
        allCalenderEventsPage.calendereventbutton();

        CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();
        BrowserUtils.waitFor(2);
        createCalendarEventsPage.repeat.click();
        extentLogger.info("click Repeat");
        Assert.assertTrue(createCalendarEventsPage.repeat.isSelected());
        extentLogger.info("verifys that repeat checkbox is selected");

        CreateCalendarEventsPage createCalendarEventsPage1=new CreateCalendarEventsPage();
       Assert.assertTrue( createCalendarEventsPage1.never.isSelected(),"verify that never is selected");
        extentLogger.info("verifys that never is selected");

       Assert.assertEquals(createCalendarEventsPage1.summary.getText(),"Daily every 1 day");
        extentLogger.info("verifys that sumary is Daily every 1 day");
    }
    @Test
    public void testcase10() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as a storemanager");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.waitFor(5);
        extentLogger.info("click create calender event");
        allCalenderEventsPage.calendereventbutton();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        BrowserUtils.waitFor(2);
        createCalendarEventsPage.repeat.click();
        extentLogger.info("click Repeat");
        BrowserUtils.waitFor(3);
        createCalendarEventsPage.after.click();
        BrowserUtils.waitFor(2);
        createCalendarEventsPage.repeatocurrunces.sendKeys("10");
        BrowserUtils.waitFor(2);
        createCalendarEventsPage.after.click();
        BrowserUtils.waitFor(5);

        Assert.assertEquals(createCalendarEventsPage.summary.getText(),"Daily every 1 day");
        Assert.assertEquals(createCalendarEventsPage.summary1.getText(),", end after 10 occurrences");
    }
    @Test
    public void testcase11() throws InterruptedException {

        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("username: " + username);
        extentLogger.info("password: " + password);
        extentLogger.info("Login as a storemanager");
        loginPage.login(username, password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Activities", "Calendar Events");

        AllCalenderEventsPage allCalenderEventsPage = new AllCalenderEventsPage();
        BrowserUtils.waitFor(5);
        extentLogger.info("click create calender event");
        allCalenderEventsPage.calendereventbutton();

        CreateCalendarEventsPage createCalendarEventsPage=new CreateCalendarEventsPage();
        BrowserUtils.waitFor(3);
        createCalendarEventsPage.repeat.click();
        createCalendarEventsPage.by.click();
        BrowserUtils.waitFor(3);
        createCalendarEventsPage.byDate.sendKeys("Nov 18, 2021");
        createCalendarEventsPage.displaysummary();




    }
}