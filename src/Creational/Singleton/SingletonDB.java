package Creational.Singleton;

public class SingletonDB {

    //Add volatile for threadsafe to remain single instance inside the JVM
    private static volatile SingletonDB instance = null;

    private SingletonDB() {
        if (instance != null) {
           throw  new RuntimeException("use getInstance() method to create");
        }
    }

    public static SingletonDB getInstance() {

        //lazy loading
        if(instance == null) {
            //threadsafe
            synchronized (SingletonDB.class) {
                if(instance == null) {
                    instance = new SingletonDB();
                }
            }
        }
        return instance;
    }
}
