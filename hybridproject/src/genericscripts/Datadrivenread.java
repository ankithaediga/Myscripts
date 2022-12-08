package genericscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadrivenread {
	public static String getexcel(String shet,int ro,int cel) throws EncryptedDocumentException, IOException
	{
		
	FileInputStream fs=new FileInputStream("./poi/Excel2.xlsx");
	Workbook book = WorkbookFactory.create(fs);
	Cell val1 = book.getSheet(shet).getRow(ro).getCell(cel);
	String res = val1.getStringCellValue();
	return res;	
	}

}
