package odev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class task06 extends TestBase {
   @Test
    public void task06(){

       // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
       driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

// ikinci emojiye tıklayın
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='emoojis']")));
       driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

// İkinci emoji öğelerini yazdırınız
  WebElement emoji = driver.findElement(By.xpath("//div[@id='nature']"));
      System.out.println(emoji.getText());




// Parent iframe e geri donun
       driver.switchTo().parentFrame();

// Formu doldurun,(Formu istediğiniz metinlerle doldurun)

       driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[1]")).sendKeys("SALİH");
       driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[2]")).sendKeys("SALİH");
       driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[3]")).sendKeys("KARAGÖZ");
       driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[4]")).sendKeys("SALİH");
       driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[5]")).sendKeys("KARAGÖZ");
       driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[6]")).sendKeys("SALİH");
       driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[7]")).sendKeys("KARAGÖZ");
       driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[8]")).sendKeys("SALİH");
       driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[9]")).sendKeys("KARAGÖZ");

       bekle(5);


// Apply button a basiniz

      driver.findElement(By.xpath("//button[@id='send']")).click();

   }
}
