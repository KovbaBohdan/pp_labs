package org.example.hotel.repository;

import org.example.hotel.entity.Booking;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookingRepository {
    private List<Booking> bookingList = new ArrayList<>();
    private static long ID = 1;

    public Booking getBookingById(long id) {
        return bookingList.stream()
                .filter(booking -> booking.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("No such booking"));
    }

    public List<Booking> getBookings() {
        return bookingList;
    }

    public Booking save(Booking booking) {
        booking.setId(ID);
        bookingList.add(booking);
        ++ID;
        return booking;
    }

    public Booking updateBooking(Booking updatedBooking) {
        Booking booking = bookingList.stream().
                filter(b -> b.getId() == updatedBooking.getId())
                .findAny()
                .orElseThrow(() -> new RuntimeException("No such booking"));
        booking.setDateOfBooking(updatedBooking.getDateOfBooking());
        booking.setDaysOfBooking(updatedBooking.getDaysOfBooking());
        booking.setUser(updatedBooking.getUser());
        return booking;
    }

    public void deleteBookingById(long id) {
        bookingList.removeIf(booking -> booking.getId() == id);
    }
}