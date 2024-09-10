package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelUtility 
{
	public static FileInputStream f;
	 public static XSSFWorkbook w;
	 public static XSSFSheet s;
	 public static String get_Stringdata(int row, int column, String sheet) 
	 {
		 try
		 {
		 f=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\QAlegand\\src\\test\\resources\\TestData.xlsx");
		 w=new XSSFWorkbook(f);
		 s=w.getSheet(sheet);
		 XSSFRow r=s.getRow(row);
		 XSSFCell c=r.getCell(column);
		 return c.getStringCellValue();
		 }
		 catch(Exception e)
		 {
			 throw new RuntimeException("Exelsheet not found");
		 }
	 }
	 public static String get_Integerdata(int row, int column, String sheet) 
	 {
		 try
		 {
		 f=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\QAlegand\\src\\test\\resources\\TestData.xlsx");
		 w=new XSSFWorkbook(f);
		 s=w.getSheet(sheet);
		 XSSFRow r=s.getRow(row);
		 XSSFCell c=r.getCell(column);
		 int a=(int) c.getNumericCellValue();
		 return String.valueOf(a);
		 }
		 catch(Exception e)
		 {
			  throw new RuntimeException("Exelsheet not found");
		 }
	 }
}
