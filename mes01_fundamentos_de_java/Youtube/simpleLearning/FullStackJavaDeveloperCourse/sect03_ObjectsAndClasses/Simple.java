package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.sect03_ObjectsAndClasses;

public class Simple {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
        Cars car4 = new Cars();
        Cars car5 = new Cars();

        Bikes bikes1 = new Bikes();
        Bikes bikes2 = new Bikes();
        Bikes bikes3 = new Bikes();
        Bikes bikes4 = new Bikes();
        Bikes bikes5 = new Bikes();

        car1.name = "Lamborghini";
        car2.name = "Ferrari";
        car3.name = "Bugatti";
        car4.name = "Porsche";
        car5.name = "Pagani";

        bikes1.name = "Harley Davidson";
        bikes2.name = "Ducati";
        bikes3.name = "Suzuki";
        bikes4.name = "Ecosse";
        bikes5.name = "Yamaha";

        bikes1.cost = "$130,00";
        bikes2.cost = "$150,00";
        bikes3.cost = "$140,00";
        bikes4.cost = "$120,00";
        bikes5.cost = "$110,00";

        car1.cost = "$630,00";
        car2.cost = "$530,00";
        car3.cost = "$430,00";
        car4.cost = "$330,00";
        car5.cost = "$230,00";
    }
}
