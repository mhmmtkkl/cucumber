package Utilities;

import org.apache.poi.ss.usermodel.*;


import java.io.FileInputStream;

public class readExcel {

    public static String GetData( String myExcelName, String Which_Column , String SheetName)  {

//		Connecting to excel sheet in global variable file
        String filepath = ReadProperties.getData(myExcelName);

        FileInputStream inStream = null;

//		Get the connection with excel sheet
        try {
            inStream = new FileInputStream(filepath);
        }catch(Exception e){
            System.out.println("not able to find excel sheet ");
        }

//		take the data from excel sheet and use it as workbook
        Workbook workbook = null;
        try{
            workbook = WorkbookFactory.create(inStream);
        }catch(Exception e){
            System.out.println("not able to find the workbook");
        }

//		Open the sheet which we wana work
        Sheet WorkSheet = workbook.getSheet(SheetName);

//		Go to first Row
        Row row ;

//		go to first cell
        Cell cell ;

        String result = null;

        int rowCount = WorkSheet.getPhysicalNumberOfRows();

        for(int i = 0 ; i<rowCount ;i++) {

            row = WorkSheet.getRow(i);

            int cellCount = WorkSheet.getRow(i).getLastCellNum();

            System.out.println(cellCount);

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

    public static String GetDataFromRow( String myExcelName, String WhichRow , String SheetName , int whichCell)  {

//		Connecting to excel sheet in global variable file
        String filepath = ReadProperties.getData(myExcelName);

        FileInputStream inStream = null;

//		Get the connection with excel sheet
        try {
            inStream = new FileInputStream(filepath);
        }catch(Exception e){
            System.out.println("not able to find excel sheet ");
        }

//		take the data from excel sheet and use it as workbook
        Workbook workbook = null;
        try{
            workbook = WorkbookFactory.create(inStream);
        }catch(Exception e){
            System.out.println("not able to find the workbook");
        }

//		Open the sheet which we wana work
        Sheet WorkSheet = workbook.getSheet(SheetName);

//		Go to first Row
        Row row ;

//		go to first cell
        Cell cell ;

        String result = null;

        int rowCount = WorkSheet.getPhysicalNumberOfRows();

        for(int i = 0 ; i<rowCount ;i++) {

            row = WorkSheet.getRow(i);

            cell = row.getCell(0);

            System.out.println(cell.toString()+"<-------");
            if(cell.toString().contains(WhichRow)){

                int cellCount = WorkSheet.getRow(i).getLastCellNum();

                System.out.println("in it ");
                cell = row.getCell(whichCell);

                result = cell.toString();
                System.out.println(result + "<-------");

                break;
            }

        }

        return result;
    }


}
