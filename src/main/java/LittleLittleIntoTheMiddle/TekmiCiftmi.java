package LittleLittleIntoTheMiddle;

import java.util.Scanner;

public class TekmiCiftmi {
    public static void main(String[] args) {
        //Verilen bir sayının çift mi tek mi olduğunu bulan programı tanımlayınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Sectiginiz sayiyi giriniz");
        int sayi = scan.nextInt();
        if (sayi%2==1){
            System.out.println("Sayi Tektir");
        } if (sayi%2==0){
            System.out.println("Sayi Cifttir");
        }

    }

}
