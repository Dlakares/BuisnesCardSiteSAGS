package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Car_modification")
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

    public CarModification() {
    }

    public CarModification(String name, CarSerie serie, CarModel model, CarType type) {
        this.name = name;
        this.serie = serie;
        this.model = model;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarSerie getSerie() {
        return serie;
    }

    public void setSerie(CarSerie serie) {
        this.serie = serie;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
