package generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant //used t store data from spreadsheet
//using Apache POI jar files
// can be used in all POM files

{
	public static String getcellvalue(String path, String sheet, int row, int cell) throws IOException
	{
		FileInputStream fis = new FileInputStream(excel_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String cellvalue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
		
	}
	
	
}
