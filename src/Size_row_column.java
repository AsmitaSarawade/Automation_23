import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Size_row_column {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Mixdata.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		int rowid=sh.getLastRowNum();
		System.out.println("Row size is:"+rowid);
		for(int i=0;i<rowid;i++)
		{
		int clounmid=sh.getRow(i).getLastCellNum();
		System.out.println("Column no for "+i+"th row is :"+clounmid);
				
		}

	}

}
