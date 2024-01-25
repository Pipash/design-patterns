package structural.design.patterns.bridge;

public class Android implements PhoneOS {
    @Override
    public void display(String data) {
        System.out.println("Displaying data by Android OS: " + data);
    }

    @Override
    public void upload(String url) {
        System.out.println("Uploading data by Android os with url: "  + url);
    }

    @Override
    public void download(String data) {
        System.out.println("Downloading data by Android OS: " + data);
    }
}
