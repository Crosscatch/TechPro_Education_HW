package DataCasting;

public class AutoWidening {
    public static void main(String[] args) {
        // dar veri tipinden daha genis bir veri tipine gecmek
        // istedigimizde java donusumu otomatik olarak yapacaktir.
        byte num1 =17;
        short num2=num1;
        int num3= num2;
        long num4 = num3;
        float num5= num4;
        double num6= num5;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);

    }
}
