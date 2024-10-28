package pp_lab3;

public class Amenity {
    private String name;
    private int numberOfGuestToAdd;

    public Amenity(String name, int numberOfGuestToAdd) {
        this.name = name;
        this.numberOfGuestToAdd = numberOfGuestToAdd;
    }

    public int getNumberOfGuestToAdd() {
        return numberOfGuestToAdd;
    }

    public String getName() {
        return name;
    }
}
