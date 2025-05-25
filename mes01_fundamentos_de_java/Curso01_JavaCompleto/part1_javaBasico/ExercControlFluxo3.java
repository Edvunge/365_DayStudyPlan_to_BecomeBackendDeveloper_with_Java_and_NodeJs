package mes01_fundamentos_de_java.Curso01_JavaCompleto.part1_javaBasico;

public class ExercControlFluxo3 {
    // Crie um switch que dado valor de 1 a 7
    // considerando 1 domingo, imprima se é dia util ou final de semana
    public static void main(String[] args) {
        int num = 6;

        switch (num) {
            case 1:
                System.out.println("Final De Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.printf("%d - Dia Util\n",num);
                break;
            case 7:
                System.out.println("Final De Semana.");
                break;
            default:
                System.out.println("Numero Invalido!");
        }
    }
}
