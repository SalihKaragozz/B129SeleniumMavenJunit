package practice_day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C04_RadioButton {
    // https://demo.guru99.com/test/radio.html adresine gidin
    // radiobutton elementlerini locate edin
    // option2'yi secin
    // option2 elementlerinin secili oldugunu Test edin
    // option1 elementlerinin secili olmadıgını test edin
    // option3 elementlerinin secili olmadıgını test edin

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
        // driver.close();
    }

    @Test
    public void name() {
        // https://demo.guru99.com/test/radio.html adresine gidin
        driver.get("https://demo.guru99.com/test/radio.html");
        // radiobutton elementlerini locate edin
     WebElement option1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
     WebElement option2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
     WebElement option3 = driver.findElement(By.xpath("//input[@id='vfb-7-3']"));

     // option2'yi secin
        option2.click();

        // option2 elementlerinin secili oldugunu Test edin
        Assert.assertTrue(option2.isSelected());

        // option1 elementlerinin secili olmadıgını test edin
        Assert.assertFalse(option1.isSelected());

        // option3 elementlerinin secili olmadıgını test edin
        Assert.assertFalse(option3.isSelected());
    }
}
