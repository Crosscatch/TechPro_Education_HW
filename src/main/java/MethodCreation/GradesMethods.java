package MethodCreation;

import java.util.Scanner;

public class GradesMethods {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("-----------------Not Bilgilendirme Sistemine Hosgeldiniz----------\n" +
                "Sonucu Ogrenmek Istediginiz Notu Sayi olarak Giriniz");
        int grades = scan.nextInt();

        grade(grades);



    }

    public static void grade(int a){

        if(91<=a && a<100){
            System.out.println("Notunuz : AA");
        }
        if(81<=a && a<=90){
            System.out.println("Notunuz : AB");
        }
        if(71<=a && a<=80){
            System.out.println("Notunuz : BB");
        }
        if(61<=a && a<=70){
            System.out.println("Notunuz : BC");
        }
        if(51<=a && a<=60){
            System.out.println("Notunuz : CD");
        }
        if(41<=a && a<=50){
            System.out.println("Notunuz : DD");
        }
        if( a<=40){
            System.out.println("Maalesef Dersten Gecemediniz");
        }
    }

}
