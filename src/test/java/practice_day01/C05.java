package practice_day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-originis=*"));


        //maximize iken pencere konumunu ve ölçüsünü yazdırın
        driver.manage().window().maximize();

        System.out.println(" maximize pencere konumu" +driver.manage().window().getPosition());
        System.out.println(" maximize pencere ölçüsü" +driver.manage().window().getSize());

        // fulscreen iken pencere konumunu ve pencere ölçüsünü yazdırın
        driver.manage().window().fullscreen();

        System.out.println("fulscreen pencere konumu " + driver.manage().window().getPosition());
        System.out.println("fulscreen pencere ölçüsü " + driver.manage().window().getSize());

        //sayfayı kapatın
        driver.close();

    }
}
