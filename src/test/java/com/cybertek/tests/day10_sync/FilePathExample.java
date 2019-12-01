package com.cybertek.tests.day10_sync;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test1(){

        System.out.println(System.getProperty("user.dir"));

        String projectPath=System.getProperty("user.dir");

        String relativepath="src/test/resources/testfile.txt";

        String filePath=projectPath+"/"+relativepath;
        System.out.println(filePath);
    }

    @Test
    public void test2(){



    }
}
