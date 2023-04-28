package day20_ReadExcel_WriteExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_ExcelWrite {
        /*
    Bir "NÜFUS" sütunu oluşturup başkent nüfuslarını excel doyasına yazınız:
    (D.C: 712816, Paris: 2161000, London: 8982000, Ankara: 5663000 ...)
     */

    @Test
    public void excelWriteTest() throws IOException {
        //WorkBook ==> Sheet ==> Row ==> Cell ==> Yaz ==> Kaydet
        Workbook workbook = WorkbookFactory.create(new FileInputStream("src/test/java/resources/Capitals.xlsx"));

        Sheet sheet1 = workbook.getSheet("Sheet1");
        //1. Satır 3. sütuna yeni hücre oluştur:
        Cell yeniHucreNufus = sheet1.getRow(0).createCell(2);
        yeniHucreNufus.setCellValue("NÜFUS");
        System.out.println("yeniHucreNufus = " + yeniHucreNufus);//Henüz excel dosayasına yazdırılmadığı için dosyamızda görünmeyecektir.

        sheet1.getRow(1).createCell(2).setCellValue(712816);//Hücreye integer değeri atadık
        sheet1.getRow(2).createCell(2).setCellValue("2161000");//Hücreye String değer atadık
        sheet1.getRow(3).createCell(2).setCellValue(8982000);
        sheet1.getRow(4).createCell(2).setCellValue(5663000);
        sheet1.getRow(5).createCell(2).setBlank();//Hücreye boş değer atar

        FileOutputStream fileOutputStream = new FileOutputStream("src/test/java/resources/Capitals.xlsx");

        workbook.write(fileOutputStream);//WorkBook hafızasına alınan veriyi "src/test/java/resources/Capitals.xlsx" adresindeki dosyaya write() metodu ile kaydettik.

    }

}
