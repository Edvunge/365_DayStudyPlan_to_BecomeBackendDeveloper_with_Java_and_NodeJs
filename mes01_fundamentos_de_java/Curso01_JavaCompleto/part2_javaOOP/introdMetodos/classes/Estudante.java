package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.classes;

public class Estudante {
    /*
    Crie uma classe estudante
    com os seguintes atributos

    nome
    idade
    notas // tres notas

    Crie um método para imprimir os dados e tirar a média desse aluno
    caso a media seja maior que 6 imprimir aprovado, senão reprovado.
    */

    private String nome;
    private int idade;
    private double[] notas;

    public void print() {
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        for(double nota : notas) {
            System.out.print(nota+" ");
        }
    }

    public void mediaAluno() {
        // media = (nota1 + nota2)/2;
        double media = 0;
        for(double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if(media > 6.0) {
            System.out.println("\nALUNO APROVADO ");
        } else {
            System.out.println("\nALUNO REPROVADO ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
