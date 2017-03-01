package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
 
		public static String getCellvalue(String path,String sheet,int rw,int cc)
		{
			String v="";
			try
			{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb= WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(rw).getCell(cc).toString();
			}
			catch(Exception e)
			{
				
			}
			return v;
			
		}

	

}
