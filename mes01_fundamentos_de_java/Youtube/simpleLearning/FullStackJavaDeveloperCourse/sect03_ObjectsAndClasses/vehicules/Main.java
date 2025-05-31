package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.sect03_ObjectsAndClasses.vehicules;

public class Main {
    private static Cars car;
    private static Bikes bike;

    public static void main(String[] args) {

        Cars car = new Cars();
        Bikes bike = new Bikes();
        bike.kick();
        car.key();

    }
}
