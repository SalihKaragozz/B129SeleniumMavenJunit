package odev;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class calisma01 extends TestBase {

            //- //http:szimek.github.io/signature_pad/ sayfasına gidiniz
        //- Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        //- Çizimden sonra clear butonuna basınız
        //- Sayfayi kapatiniz


    @Test
    public void name() {
        driver.get("http:szimek.github.io/signature_pad/");

      WebElement tahta = driver.findElement(By.xpath("//div[@class='signature-pad--body']"));



        Actions actions = new Actions(driver);




        actions.clickAndHold(tahta).moveByOffset(123,52).perform();


        bekle(10);

    }
}
