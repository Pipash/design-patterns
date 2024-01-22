package creational.design.patterns.singleton.lazy;

public class SingletonLazy {
    private static SingletonLazy lazyInstance;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        //for thread safety
        synchronized (SingletonLazy.class) {
            if (lazyInstance == null) {
                lazyInstance = new SingletonLazy();
            }
        }

        return lazyInstance;
    }
}
