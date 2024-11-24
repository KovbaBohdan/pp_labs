package pp_lab3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Cottage {
    private String name;
    private Category category;
    private int maxGuests;
    private double costOfCottage;
    private List<Amenity> cottageAmenities;
    private List<Booking> bookings;
    private static final Set<Month> LOW_SEASON_MONTHS = Set.of(Month.NOVEMBER, Month.MARCH);

    public enum Category{
        STANDARD, LUX, LARGE, SMALL
    }

    public Cottage(String name, Category category, int maxGuests, double costOfCottage) {
        this.name = name;
        this.category = category;
        this.maxGuests = maxGuests;
        this.costOfCottage = costOfCottage;
        this.cottageAmenities = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addCottageAmenity(Amenity amenity) throws InvalidAmenityException{
        if (amenity.getNumberOfGuestToAdd() < 0 || amenity.getCostOfAmenity() < 0) {
            throw new InvalidAmenityException("Invalid amenity parameters");
        }
        if (amenity.getNumberOfGuestToAdd() != 0) {
            maxGuests += amenity.getNumberOfGuestToAdd();
        }
        cottageAmenities.add(amenity);
    }

    public List<Amenity> getAllAmenities(List<Amenity> townAmenities) {
        List<Amenity> allAmenities = new ArrayList<>(townAmenities);
        allAmenities.addAll(cottageAmenities);
        return allAmenities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable(LocalDate date) {
        List<String> test = new ArrayList<>();
        test.add("1.0");
        test.add("2.0");
        test.add("3");
        test.add("TEST");

        boolean available = bookings.stream()
                .noneMatch(booking -> booking.getDate().equals(date));
        return available;
    }

    public void addBooking(Booking booking, LocalDate date, String client) {
        bookings.add(booking);
    }

    public void displayBookings() {
        System.out.println("====================================================");
        System.out.println("Booking for cottage " + name + ": ");
        bookings.stream()
                .forEach(booking -> System.out.println("Date: " + booking.getDate() + ", \nClient: " + booking.getClient()));
    }

    public void displayInfo(List<Amenity> townAmenities) {
        System.out.println("====================================================");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Max number of guest: " + maxGuests);
        System.out.println("Amenities: ");
        getAllAmenities(townAmenities).stream()
                .map(Amenity::getName)
                .forEach(System.out::println);
    }

    public double calcIncome(){
        return bookings.stream()
                .mapToDouble(booking -> {
                    if (LOW_SEASON_MONTHS.contains(booking.getDate().getMonth())) {
                        costOfCottage *= 0.8;
                    }
                    return costOfCottage;
                })
                .sum();
    }

    public double calcOutcome() {
        return cottageAmenities.stream()
                .mapToDouble(Amenity::getCostOfAmenity)
                .sum();
    }
}