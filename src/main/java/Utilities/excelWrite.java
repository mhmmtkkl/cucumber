package Utilities;

import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class excelWrite {

    static int row=0;

    public static void excelWriteResult(String path , String sheetName, Scenario scenario ) {

    String testDataPath = ReadProperties.getData(path);

        //Create fielinputstream

        FileInputStream inStream=null;

        try{
            inStream = new FileInputStream(testDataPath);
        }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Workbook workbook = null;

        try{
            workbook = WorkbookFactory.create(inStream);
        }  catch (Exception e) {
            e.printStackTrace();
        }

        int column =0;

        Sheet worksheet = workbook.getSheet(sheetName);

        Row myrow = worksheet.createRow(row);

        Cell cell = myrow.createCell(column);
        cell.setCellValue(scenario.getId());

        cell = myrow.createCell(column+1);
        cell.setCellValue(scenario.getStatus());


        //save changes
        FileOutputStream outStream = null;
        try{
            outStream = new FileOutputStream(testDataPath);
            workbook.write(outStream);

            outStream.close();
            workbook.close();
            inStream.close();

        }  catch (Exception e) {
            e.printStackTrace();
        }


        row++;

        System.out.println(column);
        System.out.println(row);

    }


}
