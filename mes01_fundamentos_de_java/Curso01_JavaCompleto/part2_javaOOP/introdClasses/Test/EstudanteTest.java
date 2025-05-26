package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdClasses.Test;

import mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdClasses.Classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante student = new Estudante();
        student.idade = 23;
        student.matricula = "we332";
        student.nome = "edvaldo";

        System.out.println("IDADE DO ESTUDANTE: " + student.idade);
        System.out.println("NUMERO DE MATRICULA: " + student.matricula);
        System.out.println("NOME DO ESTUDANTE: " + student.nome);
    }
}
