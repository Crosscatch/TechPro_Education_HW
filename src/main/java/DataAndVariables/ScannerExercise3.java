package DataAndVariables;

import java.util.Scanner;

public class ScannerExercise3 {
    //Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve
    // yuksekligini isteyip prizmanin yuzey alanini ve hacmini hesaplayip yazdirin
    public static void main(String[] args) {
        Scanner prizma= new Scanner(System.in);
        System.out.println("Lutfen prizmaya ait uzun kenarin uzunlugunu giriniz");
        int uzunKenar = prizma.nextInt();
        System.out.println("Lutfen prizmaya ait kisa kenarin uzunlugunu giriniz");
        int kisaKenar = prizma.nextInt();
        System.out.println("Lutfen prizmaya ait yuksekligin uzunlugunu giriniz");
        int yukseklik = prizma.nextInt();
        System.out.println("Yuzey alani : " + ((uzunKenar*kisaKenar*2)+(uzunKenar*yukseklik*2)+(kisaKenar*yukseklik*2)));
        System.out.println("Hacim : "+ (uzunKenar*kisaKenar*yukseklik));

    }
}
