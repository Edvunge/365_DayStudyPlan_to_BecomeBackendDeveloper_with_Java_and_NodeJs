package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.sect03_ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 11;
        student.age = 21;
        student.name = "emma";

        System.out.println("Name : " + student.name + " Age " +student.age + " ID : " + student.id);
    }
}
