package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.Exercs_Arrays.OneD_ARRAY;

public class Max_And_MinValue {
    public static void main(String[] args) {
        /*
        2. Maior e Menor Valor
        Escreva um programa que encontre o maior e o menor valor em um vetor de números reais.
        */
        double[] numbers = { 1.20, 3.41, 5.62, 7.83, 9.40, 9.58, 7.76, 5.64, 3.82, 19.93 };
        double max = numbers[0];
        double min = numbers[0];

        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
            if (numbers[j] < min) {
                min = numbers[j];
            }
        }

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}
