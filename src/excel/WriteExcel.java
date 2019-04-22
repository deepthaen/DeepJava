package excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private static final String FILE_NAME 
	    = "C:\\Users\\DEEPTHA.NAIK\\Desktop\\WriteExcel.xls"; 
		FileInputStream file = new FileInputStream(FILE_NAME); 
		Workbook wb = WorkbookFactory.create(inp); 
		Sheet sheet = wb.getSheet(0); 
	    int num = sheet.getLastRowNum(); 
	    Row row = sheet.createRow(++num); 
	    row.createCell(0).setCellValue("xyz"); 
	    ..... 
	        .. 
	        // Now this Write the output to a file 
	        FileOutputStream fileOut = new FileOutputStream(FILE_NAME); 
	    wb.write(fileOut); 
	    fileOut.close(); 
	} 

}
