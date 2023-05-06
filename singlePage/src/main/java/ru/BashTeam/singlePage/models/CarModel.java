package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "car_model")
@Getter
@Setter
@NoArgsConstructor
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

    public CarModel(String name, String nameRus, CarMark mark, CarType type, List<CarGeneration> generations, List<CarSerie> series, List<CarModification> modifications) {
        this.name = name;
        this.nameRus = nameRus;
        this.mark = mark;
        this.type = type;
        this.generations = generations;
        this.series = series;
        this.modifications = modifications;
    }
}
