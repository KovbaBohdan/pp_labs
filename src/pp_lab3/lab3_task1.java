package pp_lab3;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab3_task1 {
    public static void main(String[] args) {
        System.out.println("Enter cottage town name: ");
        Scanner console = new Scanner(System.in);
        String cottageTownName = console.nextLine();

        CottageTown town = new CottageTown(cottageTownName);

        System.out.println("ENTERING TOWN AMENITIES: ");
        System.out.println("Enter 'OK' if you want to add a town amenities, \n" +
                "Enter 'Stop' if you don`t want to add a town amenities: ");
        String stopInputBooking = console.nextLine();
        while(!(stopInputBooking.equals("Stop"))){
            if(stopInputBooking.equals("OK")){
                System.out.println("Enter cottage town amenity name: ");
                String cottageTownAmenityName = console.nextLine();
                System.out.println("Enter number of guest, that amenity can add to max number of guest in cottage; ");
                int numberOfGuestToAdd = Integer.parseInt(console.nextLine());
                System.out.println("Enter cost of amenity: ");
                double amenityCost = Double.parseDouble(console.nextLine());
                Amenity amenity = new Amenity(cottageTownAmenityName, numberOfGuestToAdd, amenityCost);
                town.addTownAmenity(amenity);
                System.out.println("Enter 'OK' if you want to add a town amenities, \n" +
                        "Enter 'Stop' if you don`t want to add a town amenities: ");
                stopInputBooking = console.nextLine();
            }
        }
        town.displayAmenities();

        System.out.println("ENTERING COTTAGES AND THEIR AMENITIES: ");
        System.out.println("Enter 'OK' if you want to add cottage, \n" +
                "Enter 'Stop' if you don`t want to add cottage: ");
        String stopInputCottages = console.nextLine();
        while(!(stopInputCottages.equals("Stop"))){
            if(stopInputCottages.equals("OK")){
                System.out.println("Enter cottage name: ");
                String cottageName = console.nextLine();
                System.out.println("Enter cottage category (STANDARD, LUX, LARGE, SMALL): ");
                Cottage.Category cottageCategory = Cottage.Category.valueOf(console.nextLine());
                System.out.println("Enter cottage max guest: ");
                int cottageMaxGuest = Integer.parseInt(console.nextLine());
                System.out.println("Enter cost of cottage: ");
                double cottageCost = Double.parseDouble(console.nextLine());

                Cottage cottage = new Cottage(cottageName, cottageCategory, cottageMaxGuest, cottageCost);
                town.addCottage(cottage);

                System.out.println("Enter 'OK' if you want to add a amenity to cottage, \n" +
                        "Enter 'Stop' if you don`t want to add a amenity to cottage: ");
                stopInputCottages = console.nextLine();
                if(stopInputCottages.equals("OK")){
                    System.out.println("Enter cottage amenity name: ");
                    String cottageTownAmenityName = console.nextLine();
                    System.out.println("Enter number of guest, that amenity can add to max number of guest in cottage; ");
                    int numberOfGuestToAdd = Integer.parseInt(console.nextLine());
                    System.out.println("Enter cost of amenity: ");
                    double amenityCost = Double.parseDouble(console.nextLine());
                    Amenity amenity = new Amenity(cottageTownAmenityName, numberOfGuestToAdd, amenityCost);
                    try{
                        cottage.addCottageAmenity(amenity);
                    } catch (InvalidAmenityException e){
                        System.out.println(e.getMessage());
                    }

                }
                cottage.displayInfo(town.getTownAmenities());
                System.out.println("Enter 'OK' if you want to add a cottage, \n" +
                        "Enter 'Stop' if you don`t want to add a cottage: ");
                stopInputCottages = console.nextLine();
            }
        }
        town.displayCottages();

        System.out.println("ENTERING BOOKING: ");
        System.out.println("Enter 'OK' if you want to booking cottage, \n" +
                "Enter 'Stop' if you don`t want to booking cottage: ");
        String stopInputBook = console.nextLine();
        while(!(stopInputBook.equals("Stop"))){
            if(stopInputBook.equals("OK")){
                System.out.println("Available cottages for booking:");
                town.displayCottages();
                System.out.println("Enter cottage name for booking: ");
                String cottageNameToBook = console.nextLine();
                Cottage selectedCottage = null;
                try {
                    selectedCottage = town.getCottageByName(cottageNameToBook);
                } catch (CottageNotFoundException e) {
                    System.out.println("Error: Cottage with name '" + cottageNameToBook + "' not found.");
                    continue;
                }

                System.out.println("Enter the client's name for booking: ");
                String clientName = console.nextLine();
                System.out.println("Enter the booking date (YYYY-MM-DD): ");
                LocalDate bookingDate = LocalDate.parse(console.nextLine());

                if (town.bookCottageForClient(selectedCottage, clientName, bookingDate)) {
                    System.out.println("Booking successful!");
                } else {
                    System.out.println("This cottage is not available for the selected date.");
                }

                selectedCottage.displayBookings();
                System.out.println("Enter 'OK' if you want to book another cottage, \n" +
                        "Enter 'Stop' if you don't want to book any more cottages: ");
                stopInputBook = console.nextLine();
            }
        }

        double income = town.calcCottageTownIncome();
        double outcome = town.calcCottageTownOutcome();
        System.out.println(income + " " + outcome);
    }
}
