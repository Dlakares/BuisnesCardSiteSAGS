package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Car_generation")
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

    public CarGeneration() {
    }

    public CarGeneration(String name, String yearBegin, String yearEnd, CarModel model, CarType type, CarSerie serie) {
        this.name = name;
        this.yearBegin = yearBegin;
        this.yearEnd = yearEnd;
        this.model = model;
        this.type = type;
        this.serie = serie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarSerie getSerie() {
        return serie;
    }

    public void setSerie(CarSerie serie) {
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBegin() {
        return yearBegin;
    }

    public void setYearBegin(String yearBegin) {
        this.yearBegin = yearBegin;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
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

