/*public class SingletonExample {

    // Static member holds only one instance of the

    // SingletonExample class

    private static SingletonExample singletonInstance;

    // SingletonExample prevents any other class from instantiating

    private SingletonExample() {

    }

    // Providing Global point of access

    public static SingletonExample getSingletonInstance() {

        if (null == singletonInstance) {

            singletonInstance = new SingletonExample();
            System.out.println("Creating new instance");

        }

        return singletonInstance;

    }

    public void printSingleton(){

        System.out.println("Inside print Singleton");

    }

}*/

public class SingletonExample {

    private static final SingletonExample singletonInstance = new SingletonExample();

    // SingletonExample prevents any other class from instantiating

    private SingletonExample() {

    }

    // Providing Global point of access

    public static SingletonExample getSingletonInstance() {

        return singletonInstance;

    }

    public void printSingleton(){

        System.out.println("Inside print Singleton");

    }

}