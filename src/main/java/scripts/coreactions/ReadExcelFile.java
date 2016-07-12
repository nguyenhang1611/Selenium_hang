package main.java.scripts.coreactions;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * @class ReadExcelFile
 * 
 * @author HangNT
 * @since 2017/07/13
 *
 */
public class ReadExcelFile {
	/**
	 * getCellValue method
	 * 
	 * @author HangNT
	 * @since 2017/07/13
	 * @param filePath
	 * @param fileName
	 * @param Sheet
	 * @param row
	 * @param col
	 * @return
	 */
	public String getCellValue(String filePath, String fileName, String Sheet, int row, int col) {
		try {
			File file = new File(filePath + "\\" + fileName);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = null;

			// Find the file extension by spliting file name in substring and
			// getting only extension name
			String fileExtensionName = fileName.substring(fileName.indexOf("."));

			// Check condition if the file is xlsx file
			if (fileExtensionName.equals(".xlsx")) {
				// If it is xlsx file then create object of XSSFWorkbook class
				workbook = new XSSFWorkbook(inputStream);
			}
			// Check condition if the file is xls file
			else if (fileExtensionName.equals(".xls")) {
				// If it is xls file then create object of XSSFWorkbook class
				workbook = new HSSFWorkbook(inputStream);
			}
			Cell cell = workbook.getSheet(Sheet).getRow(row).getCell(col);
			return cell.getStringCellValue();
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * getRowCount method
	 * 
	 * @author HangNT
	 * @since 2017/07/13
	 * @param filePath
	 * @param fileName
	 * @param Sheet
	 * @return
	 */
	public int getRowCount(String filePath, String fileName, String Sheet) {
		try {
			File file = new File(filePath + "\\" + fileName);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = null;

			// Find the file extension by spliting file name in substring and
			// getting only extension name
			String fileExtensionName = fileName.substring(fileName.indexOf("."));

			// Check condition if the file is xlsx file
			if (fileExtensionName.equals(".xlsx")) {
				// If it is xlsx file then create object of XSSFWorkbook class
				workbook = new XSSFWorkbook(inputStream);
			}
			// Check condition if the file is xls file
			else if (fileExtensionName.equals(".xls")) {
				// If it is xls file then create object of XSSFWorkbook class
				workbook = new HSSFWorkbook(inputStream);
			}
			return workbook.getSheet(Sheet).getLastRowNum();
		} catch (Exception e) {
			return 0;
		}
	}
}
