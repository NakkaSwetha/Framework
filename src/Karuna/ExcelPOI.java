package Karuna;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPOI {
public static void main(String[] args)throws Exception {
	 FileInputStream fileinput = new FileInputStream("C:\\Users\\sowmy\\Documents\\Swetha 123.xlsx");
	XSSFWorkbook Workbook = new XSSFWorkbook(fileinput);
	XSSFSheet sheet = Workbook.getSheet("sheet1");
	System.out.println(sheet.getSheetName());
	System.out.println(sheet.getLastRowNum());
	System.out.println("Before updating celldata "+sheet.getRow(2).getCell(1));
	XSSFCell cell = sheet.getRow(2).getCell(1);
	cell.setCellValue("Test123");
	fileinput.close();
	 FileOutputStream fileOut  = new FileOutputStream("C:\\Users\\sowmy\\Documents\\sowmya 123.xlsx");
	Workbook.write(fileOut);
	System.out.println("Updated data after write is done"+cell.getStringCellValue());
	 fileOut.close();
}
}
