package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Car_generation")
@Getter
@Setter
@NoArgsConstructor
public class CarGeneration {
    @Id
    @Column(name = "id_car_generation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "year_begin")
    private String yearBegin;
    @Column(name = "year_end")
    private String yearEnd;
    @ManyToOne
    @JoinColumn(name = "id_car_model", referencedColumnName = "id")
    private CarModel model;
    @ManyToOne
    @JoinColumn(name = "id_car_type", referencedColumnName = "id")
    private CarType type;
    @ManyToOne
    @JoinColumn(name = "id_car_serie", referencedColumnName = "id")
    private CarSerie serie;

    public CarGeneration(String name, String yearBegin, String yearEnd, CarModel model, CarType type, CarSerie serie) {
        this.name = name;
        this.yearBegin = yearBegin;
        this.yearEnd = yearEnd;
        this.model = model;
        this.type = type;
        this.serie = serie;
    }
}

