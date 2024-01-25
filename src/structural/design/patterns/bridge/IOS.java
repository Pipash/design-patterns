package structural.design.patterns.bridge;

public class IOS implements PhoneOS {
    @Override
    public void display(String data) {
        System.out.println("Displaying data by IOS OS: " + data);
    }

    @Override
    public void upload(String url) {
        System.out.println("Uploading data by IOS os with url: "  + url);
    }

    @Override
    public void download(String data) {
        System.out.println("Downloading data by IOS OS: " + data);
    }
}
