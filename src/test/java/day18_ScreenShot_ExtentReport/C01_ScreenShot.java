package day18_ScreenShot_ExtentReport;

import org.junit.Test;
import utilities.TestBase;

public class C01_ScreenShot extends TestBase {
    @Test
    public void screenShotTest(){
    //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        // Sayfanın resmini alalım
        tumSayfaResmi();

        //Sonra amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Amazon sayfasının ekran görüstüsünü alalım
        tumSayfaResmi();//Method kullanarak tüm ekran resmini aldık
    }

}
