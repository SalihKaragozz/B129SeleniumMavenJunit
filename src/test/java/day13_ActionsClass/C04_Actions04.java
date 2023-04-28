package day13_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_Actions04 extends TestBase {
    /*
https://jqueryui.com/droppable/ adresine gidin
"Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
*/
    @Test
    public void actionsTest() {
//        https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable");

//        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        //Sayfada iFrame olduğu için "switch" yapıyoruz:
        driver.switchTo().frame(0);

        //Kaynak ve hedef web elementlerini locate ediyoruz:
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();//dragAndDrop() methodu kaynak elemanı hedef eleman üzerine bırakır.

    }

    @Test
    public void actionsTest2() {
//        https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable");

//        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        //Sayfada iFrame olduğu için "switch" yapıyoruz:
        driver.switchTo().frame(0);

        //Kaynak ve hedef web elementlerini locate ediyoruz:
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        bekle(2);
        actions.
                clickAndHold(source).//clickAndHold web elementi tıklar ve tutar
                moveToElement(target).//moveToElement mouse'u bir element üzerine taşır
                release().//release methodu tıklanıp tutulan mouse'u bırakır
                perform();
        //Burada dragAndDrop'tan farklı olarak işlemleri kendimiz sırayla belirttik.

    }

    @Test
    public void actionsTest3() {
//        https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable");

//        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        //Sayfada iFrame olduğu için "switch" yapıyoruz:
        driver.switchTo().frame(0);

        //Kaynak ve hedef web elementlerini locate ediyoruz:
        WebElement source = driver.findElement(By.id("draggable"));

        Actions actions = new Actions(driver);
        actions.
                clickAndHold(source).
                moveByOffset(388, 34).//moveByOffset methodu ile isteğimiz koordinata elementimizi taşıyabiliriz.
                release().
                build().
                perform();
    }
}
