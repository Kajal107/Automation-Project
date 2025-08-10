package day1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Book2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int totalRows=sheet.getLastRowNum();
		int totalCell=sheet.getRow(1).getLastCellNum();
		System.out.println("total number of rows:"+totalRows);
		System.out.println("total number of cell:"+totalCell);
		for(int i=0;i<=totalRows;i++)
		{
			XSSFRow currentRow=sheet.getRow(i);
			for(int c=0;c<totalCell;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
