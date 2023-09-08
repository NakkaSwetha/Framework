package Karuna;

import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;

public class Excel_Allrows {
public static void main(String args[]) throws Exception{
	FileInputStream file =new FileInputStream("C:\\Users\\sowmy\\AppData\\Roaming\\Microsoft\\AddIns\\Swetha.xla");
	Workbook   wb  = Workbook.getWorkbook(file);
Sheet st = wb.getSheet(0);
int rowcount=st.getRows();
System.out.println(rowcount);
for(int i=1;i<rowcount;i++) {
String empid = st.getCell(0,i).getContents();
String name = st.getCell(1,i).getContents();
String email = st.getCell(2,i).getContents();
String no = st.getCell(3,i).getContents();
System.out.println(empid+"||"+name+"||"+email+"||"+no);

}
}
}