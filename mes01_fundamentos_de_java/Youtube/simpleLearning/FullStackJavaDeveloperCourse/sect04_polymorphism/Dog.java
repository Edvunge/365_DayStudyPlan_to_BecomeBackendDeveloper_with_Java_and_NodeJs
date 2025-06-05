package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.sect04_polymorphism;

public class Dog extends AnimalSounds{
    public void Sound() {
        System.out.println("The Dog says: bow wow");
    }
    public void Sound(String angry) {
        System.out.println(angry + "The Dog says: grow1 grow1");
        super.Sound();
    }
}
