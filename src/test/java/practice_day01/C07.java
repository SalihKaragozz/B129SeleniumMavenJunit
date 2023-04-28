package practice_day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class C07 {

    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-originis=*"));
        driver.manage().window().maximize();

        //amazon adresine gidiniz
        driver.get("https://www.amazon.com");

        //arama motoruna nutella yazip aratınız
      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nutella" + Keys.ENTER);


        //sayfada kaçtane link olduğunu bulunuz
       List<WebElement> linkler = driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayısı : " + linkler.size());


        //linkleri yazdırınız
        int sayı = 1;
        for (WebElement each: linkler){
            System.out.println(sayı + " . link " + each.getText());
            sayı++;
        }
        // lambda ile
       // linkler.stream().forEach(t-> System.out.println(t.getText()));

        // pencereyi kapatınız
        driver.close();



    }
    }
