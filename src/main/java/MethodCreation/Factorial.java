package MethodCreation;

public class Factorial {
    public static int fact (int a){
        if ( a == 0 || a== 1){
            return 1;
        }
        else {
            return fact(a-1)*a;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(10));
        System.out.println(fact(5));
        System.out.println(fact(0));
        System.out.println(fact(1));

    }
}
