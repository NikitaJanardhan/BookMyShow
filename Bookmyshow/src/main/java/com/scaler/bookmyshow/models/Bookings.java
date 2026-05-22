package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity

public class Bookings extends BaseModel {
   @Enumerated(EnumType.ORDINAL)
   private BokkingStatus bookingStatus;
   @ManyToOne
   private User user;
   private Date bookedAt;
   private int amount;
   @ManyToOne
   private Show show;
   @ManyToMany
   private List<ShowSeat> showSeat;
   @OneToMany
   private List<Payment> payment;
}
