package creational.design.patterns.builder;

public class ApartmentBuilder {
    private Integer squarem = -1;
    private Integer room = -1;
    private Boolean kitchen = false;
    private String city = "";
    private String country = "";

    public ApartmentBuilder setSquarem (Integer squarem) {
        this.squarem = squarem;
        return this;
    }

    public ApartmentBuilder setRoom (Integer room) {
        this.room = room;
        return this;
    }

    public ApartmentBuilder setKitchen(Boolean kitchen) {
        this.kitchen = kitchen;
        return this;
    }

    public ApartmentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public ApartmentBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public Apartment build() {
        Apartment apartment = new Apartment(squarem, room, kitchen, city, country);
        squarem = -1;
        room = -1;
        kitchen = false;
        city = "";
        country = "";
        return apartment;
    }
}
