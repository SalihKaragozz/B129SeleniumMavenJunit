package practice_day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-originis=*"));
        driver.manage().window().maximize();

        // amazon adresine gidiniz
        driver.get("https://www.amazon.com");

        // kaynak kodlarını konsola yazdırınız
      String sayfaKaynakKodları =  driver.getPageSource();
        System.out.println(sayfaKaynakKodları);

        // kaynak kodlarında Gateway yazıyormu
        if (sayfaKaynakKodları.contains("Gateway")){
            System.out.println("Gateway yazıyor");
        }else
            System.out.println("Gateway yazMIYOR");

        // sayfayı kapat
        driver.close();


    }
}
