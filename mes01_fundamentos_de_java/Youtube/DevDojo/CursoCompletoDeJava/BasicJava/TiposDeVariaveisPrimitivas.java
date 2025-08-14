package mes01_fundamentos_de_java.Youtube.DevDojo.CursoCompletoDeJava.BasicJava;

public class TiposDeVariaveisPrimitivas {
    public static void main(String[] args) {
        int idade = 10;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 10000L;
        char caractere = 'A';
        String nome = "Edvaldo Vunge"; // não é um tipo primitivo

        System.out.println("Idade: " + idade);
        System.out.println("Salario Double: "+ salarioDouble);
        System.out.println("Salario Float: " + salarioFloat);
        System.out.println("Idade Byte: " + idadeByte);
        System.out.println("Idade Short: " + idadeShort);
        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);
        System.out.println("Número Grande: " + numeroGrande);
        System.out.println("Caractere: " + caractere);
        System.out.println("Nome: " + nome);
    }
}
