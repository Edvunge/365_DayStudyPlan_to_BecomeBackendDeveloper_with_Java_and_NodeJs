package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.sect02_introdJava;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number : ");
            int num = sc.nextInt();

            if (num >= 0) {
                System.out.println("Number is positive.");
            } else {
                System.out.println("The Number is negative.");
            }
        }
    }
}
