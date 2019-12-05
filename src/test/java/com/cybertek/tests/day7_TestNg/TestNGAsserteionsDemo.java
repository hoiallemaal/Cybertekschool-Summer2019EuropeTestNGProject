package com.cybertek.tests.day7_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAsserteionsDemo {

    @Test
    public  void test1()    {
        System.out.println("First Assertion");
        Assert.assertEquals(1,23);

        System.out.println("Second Assertion");
        Assert.assertEquals("title", "title");
    }
    @Test
    public  void test2(){
        // verify that title starts with C.

        String actualTitle="Cybertek";
        String expectedTitle="C";

        Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with C");
        //System.out.println("Second Assertion");
        //Assert.assertEquals(1,1);
        Assert.assertTrue("yasin@mail".contains("@"),"Verify @in email ");
    }
    @Test
    public void test3(){
    Assert.assertNotEquals("one","two");

    }
    @Test
    public void test4(){
        Assert.assertFalse(1<0);
    }

   //  src/test/resources/testfile.txt

  //  C:\Users\Gebruiker\IdeaProjects\Summer2019EuropeTestNGProject\src\test\resources\testfile.txt
}
