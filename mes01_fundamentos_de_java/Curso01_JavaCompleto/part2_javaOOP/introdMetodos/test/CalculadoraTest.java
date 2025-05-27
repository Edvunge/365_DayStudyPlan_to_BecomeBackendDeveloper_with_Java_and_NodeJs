package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.test;

import mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumers();
        calc.subtracDoisNumers();
        calc.multiplicDoisNumers(2, (byte)9);
        System.out.println("divisao de dois numeros");
        double result = calc.divideDoisNumers(20, 0);
        System.out.println(result);
        calc.imprimeDoisNumersDividos(20, 5);
        System.out.println("Continuando a exec");

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        calc.somaArray(numbers);

        calc.somaVarArgs(1, 2, 3, 4, 5);
    }
}
