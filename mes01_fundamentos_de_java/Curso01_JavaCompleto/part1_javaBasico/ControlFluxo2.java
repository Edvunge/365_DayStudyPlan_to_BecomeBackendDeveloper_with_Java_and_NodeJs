package mes01_fundamentos_de_java.Curso01_JavaCompleto.part1_javaBasico;

public class ControlFluxo2 {
    public static void main(String[] args) {
        int idade = 2;
        String status;

        if (idade < 10) {
            status = "nao adulto";
        } else {
            status = "adulto";
        }
        status = idade < 18 ? "nao adulto" : "adulto";
        System.out.println(status);
    }
}
