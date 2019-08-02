package singleton;

public class App {
    public static void main(String[] args) {
        SingletonExample instance = SingletonExample.getSingletonInstance();
        System.out.println(instance);

        SingletonExample secondInstance = SingletonExample.getSingletonInstance();
        System.out.println(secondInstance);

        instance.testString = instance.testString.toUpperCase();
        System.out.println(secondInstance.getTestString());


        if (instance == secondInstance)
            System.out.println("Different references to same object");
    }
}
