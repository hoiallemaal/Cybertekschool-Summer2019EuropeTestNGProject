package com.cybertek.tests.day_17_ddf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFwithDataProvider {

    @DataProvider
    public Object[] []  testData(){
        String [] [] data={
            {"GoT","9"},
            {"HIMM","9"},
            {"Friends","10"},
            {"Person of Interest","10"},
            {"Breaking Bad","9"},
            {"Big Bang Theory","9"},
            {"Chernobyl","9"},
                {"Prison Break","9"}
        };
        return  data;
    }
        // get the data from data provider and pass as an argument
        @Test(dataProvider = "testData")
        public  void test1(String tvshow, String  rating){

            System.out.println("Tv show: "+tvshow+ " has rating "+rating);
        }

}