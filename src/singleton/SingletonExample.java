package singleton;

public class SingletonExample {
    private static volatile SingletonExample singletonInstance = null;
    public String testString;

    private SingletonExample() {
        testString = "Will All Strings Change?";
    }

    public static SingletonExample getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (SingletonExample.class) {
                if (singletonInstance == null)
                    singletonInstance = new SingletonExample();
            }
        }
        return singletonInstance;
    }

    public String getTestString() {
        return this.testString;
    }

}
