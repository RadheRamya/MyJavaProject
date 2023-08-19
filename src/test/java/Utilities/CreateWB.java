package Utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CreateWB {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    public CreateWB(String excelfilePath) throws IOException {
        File wb = new File(excelfilePath);
        FileInputStream fip = new FileInputStream(wb);
        workbook = new XSSFWorkbook(fip);
    }

    public String getData(int sheetnumber, int row, int column) {
        sheet = workbook.getSheetAt(sheetnumber);
        String data = sheet.getRow(row).getCell(column).getStringCellValue();
        return data;
    }

    public int getRowCount(int sheetIndex) {
        int row = workbook.getSheetAt(sheetIndex).getLastRowNum();
        row = row + 1;
        return row;
    }

 }


