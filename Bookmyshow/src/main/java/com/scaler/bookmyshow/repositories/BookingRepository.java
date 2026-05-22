package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Bookings, Long> {

}
