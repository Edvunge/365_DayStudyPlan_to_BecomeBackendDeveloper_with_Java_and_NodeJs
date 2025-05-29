package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.test;

import mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("eduardo costa");
        estudante.setIdade(29);
       // double[] notas = new double[]{12.2, 3.4, 5.4, 6.7};
        //estudante.notas = new double[]{12.2, 3.4, 5.4, 6.7};
        estudante.setNotas(new double[]{12.2, 3.4, 5.4, 6.7});

        estudante.print();
        estudante.mediaAluno();
    }
}
