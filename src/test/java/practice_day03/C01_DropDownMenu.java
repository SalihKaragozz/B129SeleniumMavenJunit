package practice_day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C01_DropDownMenu {
    // https://www.amazon.com/ sayfasina gidin
    // dropdown'dan "Books" secenegini secin
    // arama cubuguna "Java" aratın
    // arama sonuclarinin Java icerdigini test edin

    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remot-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();

    }

    @Test
    public void name() {
        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");

        // dropdown'dan "Books" secenegini secin

        //DropDown 3 adımda handle edilir
        //1- DropDown Locate edilmelidir
      WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

      //2- Select Objesi oluşturulur
        Select select = new Select(ddm);

        //3- Opsiyonlardan 1 tanesi seçilir
        select.selectByVisibleText("Books");


        // arama cubuguna "Java" aratın
      driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java" + Keys.ENTER);



        // arama sonuclarinin Java icerdigini test edin
      WebElement aramaSonucElementi =  driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
      String aramaSonucYazısı = aramaSonucElementi.getText();
      Assert.assertTrue(aramaSonucYazısı.contains("Java"));

    }
}
