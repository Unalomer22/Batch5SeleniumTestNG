package com.eurotech.test.day20_DDF;

import com.eurotech.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExelUtilDemo {

    @Test
    public void readExcelFile(){

        //Create an object from excel utils
        //it accepts two arguments
        //Argument 1 : Location of the file (path)
        //Argument 2 : sheet that we want to open (sheetName)

        ExcelUtil testData = new ExcelUtil("src/test/resources/EurotechTestB5.xls",
                "Test Data");

        //How many rows in the sheet
        System.out.println("testData.rowCount() = " + testData.rowCount()); // 10

        //How many columns in the sheet
        System.out.println("testData.columnCount() = " + testData.columnCount());// 5

        //get all columns names
        System.out.println("testData.getColumnsNames() = " + testData.getColumnsNames());
//get all data in list of String
        List<Map<String, String>> dataList = testData.getDataList();
        //iter
        for (Map<String, String> oneRow : dataList) {
            System.out.println("oneRow = " + oneRow);
        }
        //How can I get third row (hakans)
        System.out.println("dataList.get(2) = " + dataList.get(2));
        //get Aycan's company
        System.out.println("dataList.get(6).get(\"Company\") = " + dataList.get(6).get("Company"));
        //get gigi's title
        System.out.println("dataList.get(3).get(\"Title\") = " + dataList.get(3).get("Title"));

        //get array
        String[][] dataArray = testData.getDataArray();
        System.out.println(Arrays.deepToString(dataArray));

    }

}
