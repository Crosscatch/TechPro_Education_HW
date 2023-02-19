package LittleLittleIntoTheMiddle;

import java.util.Scanner;

public class CheckPoints {

    //Write a program to enter the values of two variables 'a' and 'b' from keyboard and
    //then check if both the conditions 'a < 50' and 'a < b' are true.
    public static void main(String[] args) {
        Scanner scanCheck = new Scanner(System.in);
        System.out.println("Please, Entry First Number");
        int firstNumber = scanCheck.nextInt();
        System.out.println("Please, Entry Second Number");
        int secondNumber = scanCheck.nextInt();
        checker(firstNumber,secondNumber);
    }

    public static void checker(int a, int b){
        if (a<50 && a<b){
            System.out.println("Numbers are providing the function");
        } else if (!(a<50 && a<b)) {
            System.out.println("Numbers are not providing the function");

        }
    }
}
