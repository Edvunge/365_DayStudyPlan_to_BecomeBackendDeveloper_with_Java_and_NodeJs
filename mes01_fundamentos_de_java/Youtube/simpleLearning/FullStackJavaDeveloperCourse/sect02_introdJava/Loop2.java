package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.sect02_introdJava;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your choice, 1 for the Noodles, 2 for Milshake, 3 for fruits");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Noodles");
            } else if (choice == 2) {
                System.out.println("Milshake");
            } else if (choice == 3) {
                System.out.println("Fruits");
            } else if (choice == 4) {
                System.out.println("Coffee");
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
