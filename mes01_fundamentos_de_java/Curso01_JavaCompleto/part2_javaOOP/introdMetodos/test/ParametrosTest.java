package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.test;

import mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num = 5;
        int num1 = 10;
        calc.alteraDoisNumers(num, num1);
        System.out.println("Dentro do teste");
        System.out.println("num: " + num);
        System.out.println("num1: " + num1);
    }
}
