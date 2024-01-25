package structural.design.patterns.bridge;

public class Instagram implements App {

    private final PhoneOS phoneOS;

    public Instagram(PhoneOS phoneOS) {
        this.phoneOS = phoneOS;
    }
    @Override
    public void runApp() {
        System.out.println();
        phoneOS.display("cached Data");
        phoneOS.upload("https://instagram.com");
        phoneOS.download("data from instagram");
        phoneOS.display("latest uploaded data");
    }
}
