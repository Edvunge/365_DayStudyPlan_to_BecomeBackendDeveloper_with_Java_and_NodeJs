package mes01_fundamentos_de_java.javaComoProgramar_Ed6.cap02_introducaoAP_Java.Exercs;

import java.util.Scanner;

public class Exerc2_15 {
    // 2.15 Escreva um aplicativo que solicita ao usuario inserir dois inteiros,
    // obtem esses numeros e imprime sua soma, produto, diferença e quociente, utilize técnicas mostradas.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Insira o primeiro numero: ");
        int num = input.nextInt();

        System.out.printf("Insira o segundo numero: ");
        int num2 = input.nextInt();

        int soma = num2 + num;
        int produto = num2 * num;
        int diferenca = num2 - num;
        int quociente = num2 / num;


        System.out.printf("\nA soma de %d + %d = %d",num ,num2 ,soma);
        System.out.printf("\nA subtracao de %d * %d = %d",num ,num2 ,produto);
        System.out.printf("\nA diferenca de %d - %d = %d",num ,num2 ,diferenca);
        System.out.printf("\nA quociente de %d / %d = %d",num ,num2 ,quociente);
        input.close();
    }
}
