package MethodCreation;

public class MethodCreation {
    public static void main(String[] args) {
        /* 1 : Access Modifier
           2 : Return Type
           3 : Method Name
           4 : Parantez
           5 : Method Body
        */
        /* Return Type: Methodun ne urettigini ve bize ne dondurdugunu belirtir.
        Return Type,, primitive veya non-primitive tum data type larindan olabilir.

        Eger method bir sey dondurmeyecekse (hesaplama veya islem yapmayacaksa)
        return type olarak VOID kullanilir.

        Return Type olarak void disinda bir sey yazdiysak methodun
        sonunda mutlaka return keyword kullanilmalidir.

        Return keyword'den sonra return type'a
        uygun bir deger veya variable yazilmalidir.

        Return type'a sahip methodlar cagrildiklari satira,
        return keyword'den sonra yazilan deger veya variable'i dondururler.
      */
        /* dondurmekle yazdirmak farklidir . ---For example---
        Bir method 3 ve 5 i girdi olarak aliyor ve ekrana 8 yazdiriyorsa  --->> "void" kullanilir
        Bir method 3 ve 5 i girdi olarak aliyor ve 8 sayisini donduruyorsa --->> "int" kullanilir
         */


        toplama(5,7);
    }

    private static void toplama (int num1, int num2){

        System.out.println(num1+num2);
    }

}
