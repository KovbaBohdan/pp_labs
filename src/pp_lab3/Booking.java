package pp_lab3;

import java.time.LocalDate;

public class Booking {
    private String client;
    private LocalDate date;

    public Booking(String client, LocalDate date) {
        this.client = client;
        this.date = date;
    }

    public String getClient() {
        return client;
    }

    public LocalDate getDate() {
        return date;
    }
}
