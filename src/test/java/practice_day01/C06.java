package practice_day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C06 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-originis=*"));

        //pencere konumunu ve pencere ölçüsünü yazdırınız
        System.out.println("eski konum : " +driver.manage().window().getPosition());
        System.out.println("eski ölçü : " +driver.manage().window().getSize());

        //pencere konumunu 20,20 yapınız, pencere ölçüsünü 900,600 olarak değiştirelim
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(900,600));

        //yeni pencere konumunu ve yeni pencere ölçüsünü yazdırınız
        System.out.println("yeni konum : " +driver.manage().window().getPosition());
        System.out.println("yeni ölçü : " +driver.manage().window().getSize());

    }
}
