package util;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.HashMap;

	import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class UtilKit3 {
		static FileInputStream fis1;

	    public static HashMap<String, String> getTestDataFromExcel(String testcase) {
	        try {
	            fis1 = new FileInputStream("C:\\Users\\durga\\Documents\\New folder\\Test0001.xlsx");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        XSSFWorkbook wb = null;
	        try {
	            wb = new XSSFWorkbook(fis1);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        XSSFSheet ws = wb.getSheet("Sheet1");

	        ArrayList<Row> testCaseRows = getTestCaseRows(ws, testcase);

	        HashMap<String, String> testDataMap = new HashMap<String, String>();

	        for (int i = 0; i < testCaseRows.size(); i++) {
	            int noOfCells = testCaseRows.get(i).getLastCellNum();
	            for (int j = 1; j < noOfCells; j++) {
	                Cell keyCell = testCaseRows.get(0).getCell(j);
	                Cell valueCell = testCaseRows.get(1).getCell(j);
	                
	                String key = getCellValueAsString(keyCell);
	                String value = getCellValueAsString(valueCell);
	                
	                testDataMap.put(key, value);
	            }
	        }

	        return testDataMap;
	    }

	    private static ArrayList<Row> getTestCaseRows(XSSFSheet ws, String testcase) {
	        ArrayList<Row> allRows = new ArrayList<Row>();

	        for (int i = 0; i <= ws.getLastRowNum(); i++) {
	            if (ws.getRow(i) != null) {
	                allRows.add(ws.getRow(i));
	            }
	        }

	        System.out.println("No of allRows " + allRows.size());

	        ArrayList<Row> testCaseRows = new ArrayList<Row>();

	        for (Row row : allRows) {
	            if (row.getCell(0).getStringCellValue().equalsIgnoreCase(testcase)) {
	                testCaseRows.add(row);
	            }
	        }

	        System.out.println("No of testCaseRows " + testCaseRows.size());

	        return testCaseRows;
	    }

	    private static String getCellValueAsString(Cell cell) {
	        if (cell == null) {
	            return "";
	        }

	        if (cell.getCellType() == CellType.STRING) {
	            return cell.getStringCellValue();
	        } else if (cell.getCellType() == CellType.NUMERIC) {
	            if (DateUtil.isCellDateFormatted(cell)) {
	                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	                return dateFormat.format(cell.getDateCellValue());
	            } else {
	                return String.valueOf(cell.getNumericCellValue());
	            }
	        } else if (cell.getCellType() == CellType.BOOLEAN) {
	            return String.valueOf(cell.getBooleanCellValue());
	        } else if (cell.getCellType() == CellType.FORMULA) {
	            return cell.getCellFormula();
	        } else {
	            return "";
	        }
	        }
	    }
