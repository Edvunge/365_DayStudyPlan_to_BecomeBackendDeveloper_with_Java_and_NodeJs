package mes01_fundamentos_de_java.javaComoProgramar_Ed6.cap02_introducaoAP_Java.Exercs;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.print("Enter first integer: ");
        x = input.nextInt();

        System.out.print("Enter second integer: ");
        y = input.nextInt();

        System.out.print("Enter third integer: ");
        z = input.nextInt();

        result = x * y * z;
        System.out.printf("Product is %d", result);
    }
}
