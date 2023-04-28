package day07;

import org.junit.*;

public class C04_BeforeClassAfterClass {
   /*
   @BeforeClass ve @AfterClass notasyonları sadece statik methodlar ile çalışır.

    */

    @BeforeClass
    public static void setUp(){
        System.out.println("Tüm teslerden önce 1 kez çalışır");
        System.out.println("=============");

    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Tüm teslerden sonra 1 kez çalışır");
        System.out.println("=============");

    }
    @Before
    public void setUp01(){
        System.out.println("her testen önce çalışır");
        System.out.println("=============");
    }

    @After
    public void tearDown01(){
        System.out.println("her testen sonra çalışır");
        System.out.println("=============");
    }


    @Test
    public void test01(){
        System.out.println("ilk test");
        System.out.println("=============");
    }

    @Test
    public void test02(){
        System.out.println("ikinci test");
        System.out.println("=============");
    }

    @Test
    public void test03(){
        System.out.println("üçüncü test");
        System.out.println("=============");
    }

}
