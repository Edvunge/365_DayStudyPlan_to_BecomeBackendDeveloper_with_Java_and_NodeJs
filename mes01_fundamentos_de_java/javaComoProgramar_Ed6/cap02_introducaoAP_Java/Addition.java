package mes01_fundamentos_de_java.javaComoProgramar_Ed6.cap02_introducaoAP_Java;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int number2;
        int sum;

        System.out.println("Enter First Number: ");
        number = input.nextInt();

        System.out.println("Enter Second Number: ");
        number2 = input.nextInt();

        sum = number + number2;
        System.out.println("Sum is %d\n"+ sum);
    }
}
