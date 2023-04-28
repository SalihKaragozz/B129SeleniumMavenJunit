package odev;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class calisma extends TestBase {
    @Test
    public void name() {


    //1- "https://www.akakce.com/" Sayfasına gidiniz
    driver.get("https://www.akakce.com");

        //2- "Lenovo Tab M10 ZAAE0015TR 32 GB 10.1" Tablet"  isimli ürünün olup olmadığını doğrulayın
        driver.findElement(By.id("q")).sendKeys("Lenovo Tab M10 ZAAE0015TR 32 GB 10.1", Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[@class='pn_v8']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//h3[@class='pn_v8']")).getText());

    //3-"Lenovo Tab M10 ZAAE0015TR 32 GB 10.1" isimli ürünün farklı sitelerden fiyatlarını alın listeleyin.
       driver.findElement(By.xpath("//h3[@class='pn_v8']")).click();
        ////div[@class='pp_h_v8 wbb_v8']


    //4-En uygun fiyatın teknosa.com da olup olmadığını test edin.

    }
}
