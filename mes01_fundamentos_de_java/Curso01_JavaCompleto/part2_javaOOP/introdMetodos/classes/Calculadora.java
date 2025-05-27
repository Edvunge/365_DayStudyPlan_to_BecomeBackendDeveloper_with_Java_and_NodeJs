package mes01_fundamentos_de_java.Curso01_JavaCompleto.part2_javaOOP.introdMetodos.classes;

public class Calculadora {

    public void somaDoisNumers(){
        System.out.println(5+5);
    }

    public void subtracDoisNumers(){
        System.out.println(102-5);
    }

    public void multiplicDoisNumers(int num, byte num1){
        System.out.println(num * num1);
    }

    public double divideDoisNumers(double num, double num1) {
        if (num1 != 0) {
            return num / num1;
        }
        return 0;
    }

    public void imprimeDoisNumersDividos(double num, double num1) {
        if (num1 != 0) {
            System.out.println(num / num1);
            return;
        }
            System.out.println("nao eh possivel dividir por 0");
    }

    public void alteraDoisNumers(int num, int num1) {
        num = 30;
        num1 = 40;
    }




}
