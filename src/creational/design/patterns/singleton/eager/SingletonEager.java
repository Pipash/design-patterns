package creational.design.patterns.singleton.eager;

public class SingletonEager {
    private static final SingletonEager singletonEager = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getSingletonEager() {
        return singletonEager;
    }
}
