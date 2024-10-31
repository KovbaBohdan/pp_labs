package pp_lab3;

public class Amenity {
    private String name;
    private int numberOfGuestToAdd;
    private double costOfAmenity;

    public Amenity(String name, int numberOfGuestToAdd, double costOfAmenity) {
        this.name = name;
        this.numberOfGuestToAdd = numberOfGuestToAdd;
        this.costOfAmenity = costOfAmenity;
    }

    public double getCostOfAmenity() {
        return costOfAmenity;
    }

    public int getNumberOfGuestToAdd() {
        return numberOfGuestToAdd;
    }

    public String getName() {
        return name;
    }
}
