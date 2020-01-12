package com.cybertek.tests.day_17_ddf;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {

    @Test
    public  void  readExcelFile(){


        //create an object from excel utils
        //it accepts two arguments
        //Argument 1= locaion of the file:path
        //Argument2 sheet that we want to open


        ExcelUtil qa3short=new ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA3-short");
        //how many rows in the sheet
        System.out.println("Row counts "+qa3short.rowCount());
        //how many columns in the sheet
        System.out.println("Column count " +qa3short.columnCount());
        //how many columns names
        System.out.println("Column names "+ qa3short.getColumnsNames());

        //System.out.print(excelUtil.getDataList());
        //get all data in list of maps
        List<Map<String, String>> dataList = qa3short.getDataList();   //write getdataList, then click alt+enter, then enter again


        System.out.println(dataList.get(10).get("firstname"));
    //print them one by one for each row
        for(Map<String ,String> onerow:dataList){
            System.out.println(onerow);

        }
        //get alldata in 2d array
        String [] [] dataArray=qa3short.getDataArray();

        //print the array
        System.out.println(Arrays.deepToString(dataArray));

    }

}
