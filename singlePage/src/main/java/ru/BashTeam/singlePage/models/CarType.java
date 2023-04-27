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
    public CarType() {
    }

    public CarType(String name, List<CarMark> marks, List<CarModel> models) {
        this.name = name;
        this.marks = marks;
        this.models = models;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
