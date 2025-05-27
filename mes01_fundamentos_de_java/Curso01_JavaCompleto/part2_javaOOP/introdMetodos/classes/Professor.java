package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.classes;

public class Professor {
    // Crie os seguintes atributos para essa classe
    // nome
    // matricula
    // rg
    // cpf
    // Crie uma classe de teste para preencher e imprimir os dados desse professor
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime() {
        System.out.printf("\n---------------------\n");
        System.out.println(this.cpf);
        System.out.println(this.rg);
        System.out.println(this.matricula);
        System.out.println(this.nome);
    }
}
