package creational.design.patterns.singleton.eager;

public class SingletonEagerMain {
    public static void main(String[] args) {
        SingletonEager eager1 = SingletonEager.getSingletonEager();
        SingletonEager eager2 = SingletonEager.getSingletonEager();

        System.out.println(eager1);
        System.out.println(eager2);
    }
}
