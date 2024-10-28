package pp_lab3;

import java.util.ArrayList;
import java.util.List;

class Cottage {
    private String name;
    private String category;
    private int maxGuests;
    private List<Amenity> cottageAmenities;
    private List<Booking> bookings;
    private String client;
    private CottageTown town;

    public Cottage(String name, String category, int maxGuests, String client, CottageTown town) {
        this.name = name;
        this.category = category;
        this.maxGuests = maxGuests;
        this.cottageAmenities = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.client = client;
        this.town = town;
    }

    public void addCottageAmenity(Amenity amenity) {
        if(amenity.getNumberOfGuestToAdd() != 0){
            maxGuests += amenity.getNumberOfGuestToAdd();
        }
        cottageAmenities.add(amenity);
    }

    public List<Amenity> getAllAmenities() {
        List<Amenity> allAmenities = new ArrayList<>(town.getTownAmenities());
        allAmenities.addAll(cottageAmenities);
        return allAmenities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }



    public void displayInfo() {
        System.out.println("Category: " + category);
        System.out.println("Max number of guest: " + maxGuests);
        System.out.println("Amenities: ");
        for (Amenity amenity : getAllAmenities()) {
            System.out.println(amenity.getName());
        }
    }
}