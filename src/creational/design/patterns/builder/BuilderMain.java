package creational.design.patterns.builder;

public class BuilderMain {
    public static void main(String[] args) {
        ApartmentBuilder builder = new ApartmentBuilder();

        Apartment ap1 = builder.setSquarem(900).setRoom(2).setKitchen(true).setCity("Rajshahi")
                .setCountry("Bangladesh").build();
        ap1.display();

        Apartment ap2 = builder.setSquarem(1200).setRoom(3).setCity("Dhaka").build();
        ap2.display();
    }
}
