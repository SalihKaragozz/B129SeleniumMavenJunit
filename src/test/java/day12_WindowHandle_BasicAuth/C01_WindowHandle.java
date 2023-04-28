package day12_WindowHandle_BasicAuth;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class C01_WindowHandle extends TestBase {
              /*
        https://www.techproeducation.com adresine gidiniz
        Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        Tab 2'de https://www.youtube.com sayfasını açınız
        Tab 3'te https://www.linkedin.com sayfasını açınız
        techproeducation sayfasına geçiniz
        youtube sayfasına geçiniz
        linkedIn sayfasına geçiniz
         */
    @Test
    public void newTabTest() {
        //  https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");


        //   Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
       assertEquals("Techpro Education | Online It Courses & Bootcamps" , driver.getTitle());


        //   Tab 2'de https://www.google.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com ");
        System.out.println(driver.getTitle());
        // Sayfa baslığının google olduğunu doğrulayınız
        assertEquals("Google", driver.getTitle() );


        //  Tab 3'te https://www.linkedin.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");
        System.out.println(driver.getTitle());
        // Sayfa baslığının LinkedIn içerdiğini doğrulayınız
        assertTrue(driver.getTitle().contains("LinkedIn"));

        // Window Handle Set ini bir List içine alıyoruz

        List<String> windowHandleList = new ArrayList<>(driver.getWindowHandles());
        System.out.println("windowHandleList = " + windowHandleList);

        //  techproeducation sayfasına geçiniz
        bekle(3);
        driver.switchTo().window(windowHandleList.get(0));


        //   youtube sayfasına geçiniz
        bekle(3);
        driver.switchTo().window(windowHandleList.get(1));

        //   linkedIn sayfasına geçiniz
        bekle(3);
        driver.switchTo().window(windowHandleList.get(2));

    }

    @Test
    public void newTabTest2() {
        //   https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");


        //   Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        assertEquals("Techpro Education | Online It Courses & Bootcamps", driver.getTitle());

        //  Tab 2'de https://www.google.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");
        assertTrue(driver.getTitle().contains("Google"));

        //   Tab 3'te https://www.linkedin.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");
        assertTrue(driver.getTitle().contains("LinkedIn"));

        //   techproeducation sayfasına geçiniz
        bekle(2);
        switchToWindow(0);

        //   youtube sayfasına geçiniz
        bekle(2);
        switchToWindow(1);
        //  linkedIn sayfasına geçiniz
        bekle(2);
        switchToWindow(2);

    }

}
