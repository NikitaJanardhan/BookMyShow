package com.scaler.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity


public class Screens extends BaseModel {

    private String name;
    @OneToMany
    private List<Seat> Seats;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<feature> feature;

}
