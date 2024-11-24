package org.example.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.hotel.entity.Booking;
import org.example.hotel.entity.User;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private long id;
    private LocalDate dateOfBooking;
    private int daysOfBooking;
    private User user;

    public static BookingDTO fromBooking(Booking booking) {
        final BookingDTO bookingDTO = new BookingDTO();

        bookingDTO.setId(booking.getId());
        bookingDTO.setDateOfBooking(booking.getDateOfBooking());
        bookingDTO.setDaysOfBooking(booking.getDaysOfBooking());
        bookingDTO.setUser(booking.getUser());

        return bookingDTO;
    }
}
