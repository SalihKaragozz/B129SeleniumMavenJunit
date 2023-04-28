package practice_day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-originis=*"));
        driver.manage().window().maximize();

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        Thread.sleep(3000);

        // ilk kutucuğa 20 giriniz
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("20");
        Thread.sleep(3000);

       // ikinci kutucuğa 30 giriniz
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("30");
        Thread.sleep(3000);

       // calculat e tıklayınız
        driver.findElement(By.xpath("//input[@id='calculate']")).click();
        Thread.sleep(3000);

        // sonucu yazdırınız
        System.out.println(driver.findElement(By.xpath("(//P)[2]")).getText());


        // sayfayı kapatınz
        driver.close();




    }
}
