package utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


		public static FileInputStream fi;
		public static FileOutputStream fo;
		public static XSSFWorkbook wb;
		public static XSSFSheet ws;
		public static XSSFRow row;
		public static XSSFCell cell;
		public static CellStyle style; 
		static String path;
		
		@SuppressWarnings("static-access")
		public
		ExcelUtils(String path)
		{
			this.path=path;
		}
		
		public void setCellData(String xlsheet,int rownum,int colnum,String data) throws IOException
		{
			
			
			File xlfile =new File(path);
			if(!xlfile.exists()) 
			{
				wb = new XSSFWorkbook();
				fo=new FileOutputStream(path);
				wb.write(fo);
			}
			
			fi=new FileInputStream(path);
			wb=new XSSFWorkbook(fi);
			
			if(wb.getSheetIndex(xlsheet)== -1)
				wb.createSheet(xlsheet);
			ws = wb.getSheet(xlsheet);
			
			if(ws.getRow(rownum)==null)
				ws.createRow(rownum);
		row = ws.getRow(rownum);
			
		
			cell=row.createCell(colnum);
			cell.setCellValue(data);
			fo=new FileOutputStream(xlfile);
			wb.write(fo);		
			wb.close();
			fi.close();
			fo.close();
					
		}
		
}
