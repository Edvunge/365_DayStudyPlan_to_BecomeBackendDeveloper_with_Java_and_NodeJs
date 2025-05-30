package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.Exercs_Arrays.OneD_ARRAY;

public class SomaElementos {
    public static void main(String[] args) {
        /*
        1. Soma de Elementos
        Crie um programa que calcula a soma de todos os elementos de um vetor de inteiros.
        */
        int[] numbers = {12, 13, 14, 15, 16, 17, 18, 19, 21, 20};
        int soma = 0;

        for (int i = 0; i < 10; i++) {
           soma += i;
        }

        System.out.println("A SOMA DE TODOS OS ELEMENTOS DO VETOR INTEIRO: " + soma);
    }
}
