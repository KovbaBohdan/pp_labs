package pp_lab3;

import java.util.ArrayList;

public class lab3_task1 {
    public static void main(String[] args) {
        CottageTown town = new CottageTown("Cottage Town 1");
        town.addTownAmenity(new Amenity("SPA", 0));
        town.addTownAmenity(new Amenity("Football field", 0));

        Cottage cottage1 = new Cottage("Cottage 1", "S", 4, "It is a free cottage", town);
        cottage1.addCottageAmenity(new Amenity("WiFi", 0));
        cottage1.addCottageAmenity(new Amenity("Kitchen", 2));

        town.addCottage(cottage1);

        Cottage cottage2 = new Cottage("Cottage 2","L", 2, "It is a free cottage", town);
        cottage2.addCottageAmenity(new Amenity("WiFi", 1));

        town.addCottage(cottage2);

        System.out.println("\nCottage 1:");
        cottage1.displayInfo();

        System.out.println("\nCottage 2:");
        cottage2.displayInfo();

        System.out.println();

        town.displayCottages();
    }
}
