package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Car_characteristic_value")
@Data
@NoArgsConstructor
public class CarCharacteristicValue {
    @Id
    @Column(name = "id_car_characteristic_value")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "value")
    private String value;
    @Column(name = "unit")
    private String unit;
    // посовещатсья с тимейтом по поводу оставшихся колонок
}
