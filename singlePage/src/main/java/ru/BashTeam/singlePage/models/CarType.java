package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "Car_type")
@Data
@NoArgsConstructor
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

    public CarType(String name, List<CarMark> marks, List<CarModel> models, List<CarGeneration> generations, List<CarSerie> series, List<CarModification> modifications) {
        this.name = name;
        this.marks = marks;
        this.models = models;
        this.generations = generations;
        this.series = series;
        this.modifications = modifications;
    }
}
