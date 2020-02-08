package Utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class excelGetMultipleData {

    public static List<String> GetData(String myExcelName, String SheetName) {

//		Connecting to excel sheet in global variable file
        String filepath = ReadProperties.getData(myExcelName);

        FileInputStream inStream = null;

//		Get the connection with excel sheet
        try {
            inStream = new FileInputStream(filepath);
        } catch (Exception e) {
            System.out.println("not able to find excel sheet ");
        }

//		take the data from excel sheet and use it as workbook
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(inStream);
        } catch (Exception e) {
            System.out.println("not able to find the workbook");
        }

//		Open the sheet which we wana work
        Sheet sheet = workbook.getSheet(SheetName);

//		Go to first Row
        Row row;

//		go to first cell
        Cell cell;

        List<String> result = new ArrayList<String>();

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {

            row = sheet.getRow(i);

            int cellCount =sheet.getRow(i).getLastCellNum();

                System.out.println(cellCount + "<----------   cell ount ");
            for(int j = 1 ; j< cellCount ; j++) {

                cell = row.getCell(j);


                result.add(cell.toString());


            }

        }



        return  result;
    }


 }
