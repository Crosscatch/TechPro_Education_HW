package DecideIforElse;

import java.util.Scanner;

public class GreatestAmong {
    public static void main(String[] args) {
        //Take two int values from user and print greatest among them.

        Scanner scanGreatestAmong= new Scanner(System.in);
        System.out.println("Please, Entry first Integer Value");
        int firstInt = scanGreatestAmong.nextInt();
        System.out.println("Please, Entry second Integer Value");
        int secondInt = scanGreatestAmong.nextInt();

        if (firstInt>secondInt){
            System.out.print("Greatest among them is : ");
            System.out.println( firstInt-1);
        }
        if (secondInt>firstInt){
            System.out.print("Greatest among them is : ");
            System.out.println(secondInt-1);
        }







    }
}
