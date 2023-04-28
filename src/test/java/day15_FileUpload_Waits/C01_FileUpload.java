package day15_FileUpload_Waits;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static junit.framework.TestCase.assertTrue;

public class C01_FileUpload extends TestBase {
                /*
        https://the-internet.herokuapp.com/upload adresine gidin
        logo.jpeg dosyasını yükleyin(uopload)
        "File Uploaded!" textinin görüntülendiğini test edin
        */

    @Test
    public void fileUploadTest() {
    //    https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");

    //    logo.jpeg dosyasını yükleyin(uopload)
       WebElement chooseFile = driver.findElement(By.id("file-upload"));
        bekle(2);
       chooseFile.sendKeys(System.getProperty("user.home")+ "/Desktop/logo.jpeg");
                                                        //C:\Users\Efendy\Desktop\logo.jpeg

        // gönderilecek(upload) dosyanın adresini choosefile butonuna sendkeys () methodu ile yazyoruz
        // bu şekilde gönderilecek dosya seçilmiş olur


        bekle(2);
     WebElement fileUploadButton =  driver.findElement(By.id("file-submit"));
     fileUploadButton.click();

    //    "File Uploaded!" textinin görüntülendiğini test edin
        WebElement fileUploadText = driver.findElement(By.xpath("//h3"));

        assertTrue(fileUploadText.isDisplayed());
    }
}
