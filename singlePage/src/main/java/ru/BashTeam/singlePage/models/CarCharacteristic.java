package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Car_characteristic")
@Getter
@Setter
@NoArgsConstructor
public class CarCharacteristic {
    @Id
    @Column(name = "id_car_characteristic")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
}
