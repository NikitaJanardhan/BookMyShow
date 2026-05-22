package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository  extends JpaRepository<ShowSeat,Long> {
    List<ShowSeat> findAllById(List<Long> showSeatIds);
}
