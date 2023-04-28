package day12_WindowHandle_BasicAuth;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static junit.framework.TestCase.assertTrue;

public class C02_BasicAuthentication extends TestBase {
    /*
   Aşağıdaki bilgileri kullanarak Authentication yapınız:

    URL:  https://the-internet.herokuapp.com/basic_auth
    Username: admin
    Password: admin
    Başarılı girişi doğrulayın

     */

    //Authentication URL : "https://admin:admin@the-internet.herokuapp.com/basic_auth"


    @Test
    public void test1(){
        //https://the-internet.herokuapp.com/basic_auth adresine gidiniz
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //Paragrafın Congratulations! kelimesini içerdiğini doğrulayınız
      String paragraf =  driver.findElement(By.xpath("//p")).getText();
      assertTrue(paragraf.contains("Congratulations"));



    }



}
