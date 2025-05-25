package mes01_fundamentos_de_java.Curso01_JavaCompleto.part1_javaBasico;

public class ControlFluxo5 {
    public static void main(String[] args) {
        double valorTotal1 = 300000;

        for (int parcela = 1; parcela <= valorTotal1; parcela++) {
            double valorParcela = valorTotal1 / parcela;
            if(valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }
        }
    }
}
