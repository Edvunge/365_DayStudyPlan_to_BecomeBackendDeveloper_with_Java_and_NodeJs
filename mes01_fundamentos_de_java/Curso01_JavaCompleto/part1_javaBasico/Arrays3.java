package mes01_fundamentos_de_java.Curso01_JavaCompleto.part1_javaBasico;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
    }
}
