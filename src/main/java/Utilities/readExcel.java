package Utilities;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;

public class readExcel {

    public static String GetData(String Which_Column , String myExcelName , String SheetName) throws Exception{

//		Connecting to excel sheet in global variable file
        String filepath = ReadProperties.getData(myExcelName);

//		Get the connection with excel sheet
        FileInputStream inStream = new FileInputStream(filepath);

//		take the data from excel sheet and use it as workbook
        Workbook workbook = WorkbookFactory.create(inStream);

//		Open the sheet which we wana work
        Sheet WorkSheet = workbook.getSheetAt(0);

//		Go to first Row
        Row row = WorkSheet.getRow(0);

//		go to first cell
        Cell cell = row.getCell(0);

        String result = null;

        int rowCount = WorkSheet.getPhysicalNumberOfRows();

        for(int i = 0 ; i<rowCount ;i++) {

            row = WorkSheet.getRow(i);

            int cellCount = WorkSheet.getRow(i).getLastCellNum();

            for(int j = 0 ;j < cellCount ;j++) {

                cell = row.getCell(j);

                if(cell.toString().equals(Which_Column)) {

                    row = WorkSheet.getRow(i+1);

                    cell = row.getCell(j);

                    System.out.println(cell + "cell is here ");

                    result = cell.toString();

                }

            }

        }

        return result;
    }



}
