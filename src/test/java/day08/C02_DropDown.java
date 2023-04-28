package day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02_DropDown {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void selectByIndex() throws InterruptedException {
        //1. Locate Dropdown Element
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

        //2. Select objesi oluştur
        Select yearDropDown = new Select(year);

        //Select objesini kullanarak 3 farklı şekilde seçim yapabiliriz:
        Thread.sleep(3000);
        yearDropDown.selectByIndex(22);//Seçenek 0'dan başlar. 2001 yılı 22. sırada

        //Ay şeçimi:
        Thread.sleep(3000);
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthDropDown = new Select(month);
        monthDropDown.selectByVisibleText("July");

        //Gün Seçimi
        Thread.sleep(3000);
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select dayDropDown = new Select(day);
        dayDropDown.selectByValue("28");
    }

    @Test//Tüm eyalet isimlerini yazdıralım
    public void printAll() {
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropDown = new Select(state);
        List<WebElement> stateList = stateDropDown.getOptions();

//        for(WebElement w : stateList){
//            System.out.println(w.getText());
//        }
        //Tavsiye edilen
        stateList.forEach(t -> System.out.println(t.getText()));
    }


}
