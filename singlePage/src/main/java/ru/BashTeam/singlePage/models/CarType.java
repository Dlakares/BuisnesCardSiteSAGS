package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "Car_type")
public class CarType {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "type")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarMark> marks;
    @OneToMany(mappedBy = "type")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarModel> models;
    @OneToMany(mappedBy = "type")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarGeneration> generations;
    @OneToMany(mappedBy = "type")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarSerie> series;
    @OneToMany(mappedBy = "type")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarModification> modifications;
    public CarType() {
    }

    public CarType(String name, List<CarMark> marks, List<CarModel> models, List<CarGeneration> generations, List<CarSerie> series, List<CarModification> modifications) {
        this.name = name;
        this.marks = marks;
        this.models = models;
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

    public List<CarGeneration> getGenerations() {
        return generations;
    }

    public void setGenerations(List<CarGeneration> generations) {
        this.generations = generations;
    }

    public List<CarModel> getModels() {
        return models;
    }

    public void setModels(List<CarModel> models) {
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CarMark> getMarks() {
        return marks;
    }

    public void setMarks(List<CarMark> marks) {
        this.marks = marks;
    }
}
