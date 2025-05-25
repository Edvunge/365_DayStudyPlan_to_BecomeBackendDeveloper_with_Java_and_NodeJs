package mes01_fundamentos_de_java.Curso01_JavaCompleto.part1_javaBasico;

public class Arrays2 {
    public static void main(String[] args) {
        //int[] idade = new int[3];
        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
