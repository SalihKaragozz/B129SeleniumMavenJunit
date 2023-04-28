package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {
    /*
   https://www.amazon.com/ sayfasına gidelim
   Arama kutusunu locate edelim
   "Samsung headphones" ile arama yapalım
   Bulunan sonuç yazısını yazdıralım
   İlk ürünü tıklayalım
   Sayfadaki tüm başlıkları yazdıralım
*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //  https://www.amazon.com/ sayfasına gidelim
        driver.get("https://www.amazon.com/");

       // Arama kutusunu locate edelim
     WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

       // "Samsung headphones" ile arama yapalım
        aramaKutusu.sendKeys("Samsung headphones" );
        aramaKutusu.submit();// enter e bastık

       // Bulunan sonuç yazısını yazdıralım
       WebElement aramaSonucu = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("aramaSonucu = " + aramaSonucu.getText());

       // İlk ürünü tıklayalım
      WebElement ilkUrun = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
       ilkUrun.click();
        //veya

        // tüm arama sonucu çkan ürünleri list içine koyup ilk elemanı alıyoruz
       //List <WebElement> urunListesi = (List<WebElement>) driver.findElement(By.xpath("//img[@class='s-image']"));
       //urunListesi.get(0).click();

       // Sayfadaki tüm başlıkları yazdıralım
      List <WebElement> basliklar =   driver.findElements(By.xpath("//h1"));
     // for (WebElement w : basliklar){
       //   System.out.println(w.getText());

      //}

        // veya bu şekilde yazdrabiliriz lambda ile
      basliklar.forEach(t-> System.out.println(t.getText()));// herbir elemanı al ve yazdır demek lambda da

        // sayfayı kapatalm
        driver.close();

    }
}
