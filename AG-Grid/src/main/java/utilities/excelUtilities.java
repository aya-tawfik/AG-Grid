package utilities;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class excelUtilities
{
    File file =    new File("C:\\Users\\Administrator\\git\\repository\\AG-Grid\\src\\main\\java\\Data\\Grid_Data.xls");
    FileInputStream inputStream;
    HSSFWorkbook wb;
    HSSFCell cell;

    public Object readData(int rownumber, String sheetname) throws IOException
    {
        inputStream = new FileInputStream(file);
        wb=new HSSFWorkbook(inputStream);
        HSSFSheet sheet=wb.getSheet(sheetname);
        HSSFRow row;
        row=sheet.getRow(rownumber);
        cell=row.getCell(0);
        Object value=null;
        switch (cell.getCellType())
        {
            case   STRING :value = cell.getStringCellValue();
                break;
            case NUMERIC : value =  cell.getNumericCellValue();
                break;
        }
        return value;
    }

}
