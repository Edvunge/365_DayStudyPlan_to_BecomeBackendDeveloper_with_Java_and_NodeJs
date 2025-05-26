package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdClasses.Test;

import mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdClasses.Classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.modelo = "Fusca";
        car.placa = "QW23GGG";
        car.velocidadeMaxima = 120f;

        System.out.println("PLACA: " + car.placa);
        System.out.println("MODELO: " + car.modelo);
        System.out.println("VELOCIDADE MAXIMA: " + car.velocidadeMaxima);
        /*

        * */
    }
}
