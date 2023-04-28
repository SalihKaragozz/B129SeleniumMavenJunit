package practice_day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-originis=*"));

        //pencereyi maximize yapın
        driver.manage().window().maximize();

        //teknosa adresine gidin
        driver.get("https://www.teknosa.com");

        //sayfanın titlesini ve url sini alıp nyazdırın
       String tenosaTtle = driver.getTitle();
        System.out.println(tenosaTtle);
      String teknosaUrl = driver.getCurrentUrl();
        System.out.println(teknosaUrl);

        //url nin teknosa kelimesini içerip içermediğini kontrol edin
        if (teknosaUrl.contains("Teknosa")) {
            System.out.println("Url teknosa içeriyor");
        }else
            System.out.println("url teknosa içermiyor");


        //medunna adresine git
        driver.get("https://www.medunna.com");

        //sayfanın titlesini ve url sini alıp yazdırın
        String medunnaTitle = driver.getTitle();
        System.out.println(medunnaTitle);
        String medunnaUrl = driver.getCurrentUrl();
        System.out.println(medunnaUrl);

        //titlenin medunna içerip içermediğini kontrol edin
        if (medunnaTitle.contains("MEDUNNA")) {
            System.out.println("Title medunna içerir");
        }else
            System.out.println("title medunna içermez");


        //url medunna içerip içermediğini kontrol edin

        if (medunnaUrl.contains("medunna")) {
            System.out.println("url medunna içerir");
        }else
            System.out.println("url medunna içermez");

        // teknosa adresine geri dön
        driver.navigate().back();

        // sayfayı yenile
        driver.navigate().refresh();

        // medunna adresine ilerle
        driver.navigate().forward();

        // sayfayı yenile
        driver.navigate().refresh();

        // sayfayı kapat
        driver.close();

    }
}