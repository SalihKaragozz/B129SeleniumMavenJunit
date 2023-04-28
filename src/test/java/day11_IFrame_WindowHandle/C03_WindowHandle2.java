package day11_IFrame_WindowHandle;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import static junit.framework.TestCase.assertEquals;

public class C03_WindowHandle2 extends TestBase {
    @Test
    public void newWindowTest() {

        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        String techproeducationWindowHandle = driver.getWindowHandle();

        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        assertEquals("Techpro Education | Online It Courses & Bootcamps", driver.getTitle());

        //Window 2'de https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();

        //Window 3'te https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();

        //techproeducation sayfasına geçiniz:
        bekle(3);
        driver.switchTo().window(techproeducationWindowHandle);

        //youtube sayfasına geçiniz:
       bekle(4);
        driver.switchTo().window(youtubeWindowHandle);

        //linkedIn sayfasına geçiniz:
        bekle(3);
        driver.switchTo().window(linkedinWindowHandle);

    }
}
