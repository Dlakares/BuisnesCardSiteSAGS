package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Table(name = "car_serie")
@Data
@NoArgsConstructor
public class CarSerie {
    @Id
    @Column(name = "id_car_serie")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "id_car_model")
    private CarModel model;
    @OneToMany(mappedBy = "serie")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarGeneration> generations;
    @ManyToOne
    @JoinColumn(name = "id_car_type")
    private CarType type;
    @OneToMany(mappedBy = "serie")
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CarModification> modifications;

    public CarSerie(String name, CarModel model, List<CarGeneration> generations, CarType type, List<CarModification> modifications) {
        this.name = name;
        this.model = model;
        this.generations = generations;
        this.type = type;
        this.modifications = modifications;
    }
}
