package creational.design.patterns.singleton.lazy;

public class SingletonLazyMain {
    public static void main(String[] args) {
        SingletonLazy lazyInstance1 = SingletonLazy.getInstance();
        SingletonLazy lazyInstance2 = SingletonLazy.getInstance();

        System.out.println(lazyInstance1);
        System.out.println(lazyInstance2);
    }
}
