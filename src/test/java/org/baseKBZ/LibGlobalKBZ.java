package org.baseKBZ;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobalKBZ {
	public static WebDriver driver;
	
	public static void browserLaunch() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	public static void toLoadUrl(String url) {
	driver.get(url);
	}
	public static void toType(WebElement element, String value) {
	element.sendKeys(value);	
	}
	public static void toClick(WebElement element) {
		element.click();
	}
	public static void toGetUrl() {
		driver.getCurrentUrl();
	}
	public static void toGetTitle() {
		driver.getTitle();
	}
	public static void toQuit() {
		driver.quit();
	}
	public static void toMax() {
		driver.manage().window().maximize();
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	public static void deteteallcookies() {
		driver.manage().deleteAllCookies();

	}
	public static void screenshot(String picName) throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Sethu\\eclipse-workspace\\Cucumbermav\\screenshot"+picName+".png");
		FileUtils.copyFile(src, des);
	}
   
    public static String excelRead(String fileName,String sheetName, int rowNo, int cellNo) throws IOException {
		//1.path of the excel file
		File f = new File("C:\\Users\\Sethu\\eclipse-workspace\\KBZBank\\Worksheets\\"+fileName+".xlsx");
	
		//2.to read a file
		FileInputStream input = new FileInputStream(f);
	
		//3.workbook instanciaiton  
		Workbook w = new XSSFWorkbook(input);
	
		//4.to read the sheet
		Sheet s = w.getSheet(sheetName);
	
		//5.to get row
		Row r = s.getRow(rowNo);
		
		//6.to get cell
    	Cell c = r.getCell(cellNo);
    	String value;
    	int cellType = c.getCellType();
    	if (cellType==1) {
			value = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			value = sim.format(d);
		}
		else {
			double num = c.getNumericCellValue();
			long l = (long)num;
			value= String .valueOf(l);
		}
		return value;
}
    	

}
