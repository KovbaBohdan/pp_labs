package pp_lab3;

import java.util.ArrayList;
import java.util.List;

public class CottageTown {
    private String name;
    private List<Cottage> cottages;
    private List<Amenity> amenitiesInTown;

    public CottageTown(String name) {
        this.name = name;
        amenitiesInTown = new ArrayList<>();
        cottages = new ArrayList<>();
    }

    public void addTownAmenity(Amenity amenity) {
        amenitiesInTown.add(amenity);
    }

    public void addCottage(Cottage cottage){
        cottages.add(cottage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Amenity> getTownAmenities() {
        return amenitiesInTown;
    }

    public List<Cottage> getCottages() {
        return cottages;
    }

    public void displayCottages(){
        for (Cottage cottage : cottages){
            System.out.println(cottage.getName());
        }
    }

}
