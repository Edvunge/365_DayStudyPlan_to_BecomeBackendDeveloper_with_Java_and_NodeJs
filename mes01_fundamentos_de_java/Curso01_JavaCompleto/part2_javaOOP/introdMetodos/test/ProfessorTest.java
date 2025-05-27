package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.test;

import mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.matricula = "11122";
        prof.cpf = "122.222.212.232-20";
        prof.nome = "Marcos";
        prof.rg = "1221221";

        Professor prof2 = new Professor();
        prof2.matricula = "33333";
        prof2.cpf = "9999.222.000.232-20";
        prof2.nome = "Matos";
        prof2.rg = "88888888888";

        prof.imprime();
        prof2.imprime();
    }
}
