package pp_lab3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Cottage getCottageByName(String cottageName) throws CottageNotFoundException{
        Optional<Cottage> findingCottage = cottages.stream()
                .filter(cottage -> cottage.getName().equals(cottageName))
                .findFirst();
        return findingCottage.orElseThrow(() ->
                new CottageNotFoundException("Cottage with name " + cottageName + " not found.")
        );
    }

    public void displayCottages(){
        System.out.println("===========================================");
        System.out.println("LIST OF COTTAGES IN COTTAGE TOWN: ");
        cottages.stream()
                .map(Cottage::getName)
                .forEach(System.out::println);
        System.out.println("===========================================");
    }

    public void displayAmenities(){
        System.out.println("===========================================");
        System.out.println("LIST OF AMENITIES IN COTTAGE TOWN: ");
        amenitiesInTown.stream()
                .map(Amenity::getName)
                .forEach(System.out::println);
        System.out.println("===========================================");
    }

    public boolean bookCottageForClient(Cottage cottage, String clientName, LocalDate bookingDate) throws BookingUnavailableException{
        if (!cottage.isAvailable(bookingDate)) {
            throw new BookingUnavailableException("Cottage " + cottage.getName() + " is not available on " + bookingDate);
        }
        Booking booking = new Booking(cottage.getName(), clientName, bookingDate);
        cottage.addBooking(booking, bookingDate, clientName);
        System.out.println("Cottage " + cottage.getName() + " successfully booked for " + clientName + " on " + bookingDate);
        return true;
    }

    public double calcCottageTownIncome() {
        return cottages.stream()
                .mapToDouble(Cottage::calcIncome)
                .sum();
    }

    public double calcCottageTownOutcome() {
        double allTownCottageOutcome = amenitiesInTown.stream()
                .mapToDouble(Amenity::getCostOfAmenity)
                .sum();

        double allCottageOutcome = cottages.stream()
                .mapToDouble(Cottage::calcOutcome)
                .sum();

        return allTownCottageOutcome + allCottageOutcome;
    }
}
