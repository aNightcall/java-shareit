package ru.practicum.shareit.booking.service;

import org.springframework.data.domain.Pageable;
import ru.practicum.shareit.booking.model.Booking;
import ru.practicum.shareit.booking.state.BookingState;

import java.util.List;

public interface BookingService {

    Booking addBooking(Booking booking);

    Booking changeStatus(Integer ownerId, Integer bookingId, Boolean approved);

    Booking getBookingById(Integer bookingId, Integer userId);

    List<Booking> getUserBookingsByState(Integer userId, BookingState state, Pageable pageable);

    List<Booking> getOwnerBookingsByState(Integer ownerId, BookingState state, Pageable pageable);
}
