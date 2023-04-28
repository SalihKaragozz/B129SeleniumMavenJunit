package day07;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class C02_BeforeAfter {

    @Before
    public void serUp(){
        System.out.println("Her test methodu öncesi birkez çalşır");

    }

    @After
    public void tearDown() {
        System.out.println("her test methodu sonrası birkere çalışacak");
    }


    @Test
    public void test01(){
        System.out.println("ilk test");
    }

    @Test
    public void test02(){
        System.out.println("ikinci test");
    }
}
