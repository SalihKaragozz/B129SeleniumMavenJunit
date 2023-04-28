package practice_day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-originis=*"));

        //pencereyim maximize yapın
        driver.manage().window().maximize();

        //amazon adresine gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        // n11 adresine gidin
        driver.get("https://www.n11.com");
        Thread.sleep(3000);

        //amazon adresine geri dön
        driver.navigate().back();
        Thread.sleep(3000);

        //n11 adresine ilerle
        driver.navigate().forward();
        Thread.sleep(3000);

        //sayfayı yenile
        driver.navigate().refresh();
        Thread.sleep(3000);

        //pencereyi kapat
        driver.close();

        //herşey yolunda yazdır
        System.out.println("herşey yolunda ");

    }
}
