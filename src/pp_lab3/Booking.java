package pp_lab3;

import java.time.LocalDate;

public class Booking {
    private String client;
    private LocalDate date;
    private String cottageName;

    public Booking(String cottageName, String client, LocalDate date) {
        this.cottageName = cottageName;
        this.client = client;
        this.date = date;
    }

    public String getClient() {
        return client;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCottage() {
        return cottageName;
    }
}
