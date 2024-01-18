package creational.design.patterns.builder;

import java.util.Objects;

public class Apartment {
    private Integer squarem;
    private Integer room;
    private Boolean kitchen;
    private String city;
    private String country;

    public Apartment(Integer sqm, Integer room, Boolean kitchen, String city, String country) {
        this.squarem = sqm;
        this.room = room;
        this.kitchen = kitchen;
        this.city = city;
        this.country = country;
    }

    public Integer getSquarem() {
        return squarem;
    }

    public void display() {
        if (squarem != -1) {
            System.out.println("Area is " + squarem +" square meter.");
        }
        if (room != -1) {
            System.out.println("Number of room is " + room);
        }

        if (kitchen) {
            System.out.println("The apartment has a kitchen");
        }

        if (!Objects.equals(city, "")) {
            System.out.println("Name of the city is " + city);
        }

        if (!Objects.equals(country, "")) {
            System.out.println("Name of the country is " + country);
        }
        System.out.println();
    }
}
