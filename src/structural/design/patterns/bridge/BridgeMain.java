package structural.design.patterns.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        App facebook = new Facebook(new Android());
        facebook.runApp();

        App instagram = new Instagram(new IOS());
        instagram.runApp();
    }
}
