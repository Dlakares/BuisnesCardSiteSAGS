package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "car_model")
public class CarModel {
    @Id
    @Column(name = "id_car_model")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "name_rus")
    private String nameRus;
    @ManyToOne
    @JoinColumn(name = "id_car_mark", referencedColumnName = "id")
    private CarMark mark;
    @ManyToOne
    @JoinColumn(name = "id_car_type", referencedColumnName = "id")
    private CarType type;
    @OneToMany(mappedBy = "model")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarGeneration> generations;
    @OneToMany(mappedBy = "model")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarSerie> series;
    @OneToMany(mappedBy = "model")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarModification> modifications;
    public CarModel() {
    }

    public CarModel(String name, String nameRus, CarMark mark, CarType type, List<CarGeneration> generations, List<CarSerie> series, List<CarModification> modifications) {
        this.name = name;
        this.nameRus = nameRus;
        this.mark = mark;
        this.type = type;
        this.generations = generations;
        this.series = series;
        this.modifications = modifications;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CarModification> getModifications() {
        return modifications;
    }

    public void setModifications(List<CarModification> modifications) {
        this.modifications = modifications;
    }

    public List<CarSerie> getSeries() {
        return series;
    }

    public void setSeries(List<CarSerie> series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameRus() {
        return nameRus;
    }

    public void setNameRus(String nameRus) {
        this.nameRus = nameRus;
    }

    public CarMark getMark() {
        return mark;
    }

    public void setMark(CarMark mark) {
        this.mark = mark;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public List<CarGeneration> getGenerations() {
        return generations;
    }

    public void setGenerations(List<CarGeneration> generations) {
        this.generations = generations;
    }
}
