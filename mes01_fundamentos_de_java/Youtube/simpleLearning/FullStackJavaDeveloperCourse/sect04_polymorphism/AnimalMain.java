package mes01_fundamentos_de_java.Youtube.simpleLearning.FullStackJavaDeveloperCourse.sect04_polymorphism;

public class AnimalMain {
    public static void main(String[] args) {
        AnimalSounds animal = new AnimalSounds();
        Cow cow = new Cow();
        Dog dog = new Dog();
        animal.Sound();
        cow.Sound();
    }
}
