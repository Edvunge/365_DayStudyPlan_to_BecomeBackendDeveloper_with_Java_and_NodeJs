package mes01_fundamentos_de_java.Curso01_JavaCompleto.part1_javaBasico;

public class ControlFluxo3_switch {
    public static void main(String[] args) {
        byte dia = 5;

        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                if (true) {
                    System.out.println("true");
                }
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Unvaible");
        }

        char sexo = 'F';

        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Unvaible");
        }
    }
}
