package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.sect02_introdJava;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println(" ");
                System.out.println("Enter the numbers to perform arthmetic operators ");

                System.out.print("Enter the first number : ");
                int x = sc.nextInt();

                System.out.println("Enter second number : ");
                int y = sc.nextInt();

                System.out.println("Choose the operation you want to perfom ");
                System.out.println("Choose 1 for ADDITION");
                System.out.println("Choose 2 for SUBTRACTION");
                System.out.println("Choose 3 for MULTIPLICATION");
                System.out.println("Choose 4 for DIVISION");
                System.out.println("Choose 5 for MODULUS");
                System.out.println("Choose 6 for EXIT");
                int n = sc.nextInt();

                switch (n) {
                    case 1:
                        int add;
                        add = x + y;
                        System.out.println("Result : " + add);
                        break;
                    case 2:
                        int sub;
                        sub = x - y;
                        System.out.println("Result : " + sub);
                        break;
                    case 3:
                        int mul;
                        mul = x * y;
                        System.out.println("Result : " + mul);
                        break;
                    case 4:
                        float div;
                        div = (float) x /y;
                        System.out.println("Result : " + div);
                        break;
                    case 5:
                        int mod;
                        mod = x % y;
                        System.out.println("Result : " + mod);
                        break;
                    case 6:
                        System.exit(0);
                }
            }
        }
    }
}
