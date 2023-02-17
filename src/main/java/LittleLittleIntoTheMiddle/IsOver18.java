package LittleLittleIntoTheMiddle;

import java.util.Scanner;

public class IsOver18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz");
        int age = scan.nextInt();
        overThan18(age);

    }
    public static void overThan18(int sayi1){
        if ( sayi1>=18 && sayi1<65){
            System.out.println("Oy Kullanabilir");

        }if (sayi1<18){
            System.out.println("Oy Kullanamaz");
        }if (sayi1>=65){
            System.out.println("Kesin AKP'lidir , Yat assa , Oy Kullanamaz");
        }
    }
}
