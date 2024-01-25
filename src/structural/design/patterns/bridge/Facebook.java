package structural.design.patterns.bridge;

public class Facebook implements App {

    private final PhoneOS phoneOS;

    public Facebook(PhoneOS phoneOS) {
        this.phoneOS = phoneOS;
    }

    @Override
    public void runApp() {
        System.out.println();
        phoneOS.display("facebook data");
        phoneOS.upload("https://facebook.com");
        phoneOS.download("data from facebook");
        System.out.println();
    }
}
