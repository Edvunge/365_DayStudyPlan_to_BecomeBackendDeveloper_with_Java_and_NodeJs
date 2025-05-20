package mes01_fundamentos_de_java.javaComoProgramar_Ed6.cap02_introducaoAP_Java;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter first integer: ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.print("%d == %d\n"+ number1 + number2);

        if (number1 != number2)
            System.out.print("%d != %d\n"+ number1 + number2);

        if (number1 < number2)
            System.out.println("%d < %d\n"+ number1 + number2);

        if (number1 > number2)
            System.out.println("%d > %d\n"+ number1 + number2);

        if (number1 <= number2)
            System.out.println("%d <= %d\n"+ number1 + number2);

        if (number1 >= number2)
            System.out.println("%d >= %d\n"+ number1 + number2);
    }
}
