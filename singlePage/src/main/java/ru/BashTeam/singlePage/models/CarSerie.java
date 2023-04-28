package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "car_serie")
public class CarSerie {
    @Id
    @Column(name = "id_car_serie")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_car_model", referencedColumnName = "id")
    private CarModel model;
    @OneToMany(mappedBy = "serie")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarGeneration> generations;
    @ManyToOne
    @JoinColumn(name = "id_car_type", referencedColumnName = "id")
    private CarType type;
    @OneToMany(mappedBy = "serie")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarModification> modifications;
    public CarSerie() {
    }

    public CarSerie(String name, CarModel model, List<CarGeneration> generations, CarType type, List<CarModification> modifications) {
        this.name = name;
        this.model = model;
        this.generations = generations;
        this.type = type;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public List<CarGeneration> getGenerations() {
        return generations;
    }

    public void setGenerations(List<CarGeneration> generations) {
        this.generations = generations;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
