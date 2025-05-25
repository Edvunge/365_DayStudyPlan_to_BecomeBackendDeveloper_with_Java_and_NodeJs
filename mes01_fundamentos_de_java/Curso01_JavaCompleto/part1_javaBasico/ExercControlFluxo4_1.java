package mes01_fundamentos_de_java.Curso01_JavaCompleto.part1_javaBasico;

public class ExercControlFluxo4_1 {
    // Imprima todos os numeros pares de 0 até 100000

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
