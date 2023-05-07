package ChartGenerating;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;


public class deneme1 {
@Test
    public void dataReading() throws IOException {
    String path="C:\\Users\\Muaz Yagci\\IdeaProjects\\generatingCharts\\bookRecord.xlsx";
    FileInputStream fileInputStream=new FileInputStream(path);

    XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);

    XSSFSheet sheet=new XSSFSheet("Month1");


}
}
