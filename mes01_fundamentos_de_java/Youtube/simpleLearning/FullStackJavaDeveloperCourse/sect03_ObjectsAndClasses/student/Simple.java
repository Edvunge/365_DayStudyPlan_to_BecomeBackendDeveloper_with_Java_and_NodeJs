package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.sect03_ObjectsAndClasses.student;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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

        System.out.println("What do you want to buy?");
        System.out.println("1. Bikes");
        System.out.println("2. Cars");
        int choice;

        System.out.println("Enter your choice : ");
        choice = s.nextInt();
        if(choice==1) {
            System.out.println("we have 5 models :");
            System.out.println("1. Harley Davidson");
            System.out.println("2. Ducati");
            System.out.println("3. Suzuki");
            System.out.println("4. Pagani");
            System.out.println("5. Yamaha");

            System.out.println("Enter your choice : ");
            int n;
            n=s.nextInt();

            if(n==1){
                System.out.println("The cost of Harley Davidson : " + bikes1.cost);
            } else if(n==2){
                System.out.println("The cost of Ducati : " + bikes2.cost);
            } else if(n==3){
                System.out.println("The cost of Suzuki : " + bikes3.cost);
            } else if(n==4){
                System.out.println("The cost of Pagani : " + bikes4.cost);
            } else if(n==5){
                System.out.println("The cost of Yamaha : " + bikes5.cost);
            } else {
                System.out.println("Please enter the value between 1-5");
            }
        } else if(choice == 2){
            System.out.println("We have 5 models available : ");
            System.out.println("1. Lamboorghini");
            System.out.println("2. Ferrari");
            System.out.println("3. Bugati");
            System.out.println("4. Ecosse");
            System.out.println("5. Porsche");
            System.out.println("Enter the choice : ");
            int c;
            c=s.nextInt();

            if(c==1){
                System.out.println("The cost Lamboorghini : " + car1.cost);
            } else if(c==2){
                System.out.println("The cost of Ferrari : " + car2.cost);
            } else if(c==3){
                System.out.println("The cost of Bugati : " + car3.cost);
            } else if(c==4){
                System.out.println("The cost of Ecosse : " + car4.cost);
            } else if(c==5){
                System.out.println("The cost of Porsche : " + car5.cost);
            } else{
                System.out.println("Please enter the value between 1-5 ");
            }
        } else {
            System.out.println("Please enter the choice between 1-2");
        }
    }
}
