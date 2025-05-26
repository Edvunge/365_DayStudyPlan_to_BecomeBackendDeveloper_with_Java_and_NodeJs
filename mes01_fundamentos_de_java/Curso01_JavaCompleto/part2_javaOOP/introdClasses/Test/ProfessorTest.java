package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdClasses.Test;

import mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdClasses.Classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "vald";
        professor.cpf = 123_456_789;
        professor.matricula = "124FF569ll";

        System.out.println("CPF DO PROFESSOR: " + professor.cpf);
        System.out.println("NOME DO PROFESSOR: " + professor.nome);
        System.out.println("MATRICULA: " + professor.matricula);
    }
}
