package day14_JavaFaker_FileExist;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.TestBase;

public class C02_JavaFaker  {

    @Test
    public void javaFakerTest(){
        // 1. Faker objesi oluştur
      Faker faker =  new Faker();

      // yada Faker.instance() static methodu ile başlayabiliriz.
        Faker.instance().funnyName();

        //firstname yazdırın
        System.out.println(faker.name().firstName());

        // last name yazdırın
        System.out.println(faker.name().lastName());

        //kullanıcı adı yazdırın
        System.out.println(faker.name().username());

        //funny name yazdırın
        System.out.println(faker.funnyName().name());

        //melek ismi yazdırın
        System.out.println(faker.name().title());

        //şehir ismi yazdırın
        System.out.println(faker.address().city());

        //eyalet ismi yazdırın
        System.out.println(faker.address().state());

        // full adres yazdırın

        System.out.println(faker.address().fullAddress());

        // cep numarası yazdırın
        System.out.println(faker.phoneNumber().cellPhone());

        // e mail yazdırın
        System.out.println(faker.internet().emailAddress());

        // posta kodu yazdırın
        System.out.println(faker.address().zipCode());

        // rastgele 15 haneli numara al
        System.out.println(faker.number().digits(15));





    }

}
