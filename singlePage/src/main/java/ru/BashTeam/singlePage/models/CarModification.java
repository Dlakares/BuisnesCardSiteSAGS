package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Car_modification")
@Getter
@Setter
@NoArgsConstructor
public class CarModification {
    @Id
    @Column(name = "id_car_modification")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_car_serie", referencedColumnName = "id")
    private CarSerie serie;
    @ManyToOne
    @JoinColumn(name = "id_car_model", referencedColumnName = "id")
    private CarModel model;
    @ManyToOne
    @JoinColumn(name = "id_car_type", referencedColumnName = "id")
    private CarType type;

    public CarModification(String name, CarSerie serie, CarModel model, CarType type) {
        this.name = name;
        this.serie = serie;
        this.model = model;
        this.type = type;
    }
}
