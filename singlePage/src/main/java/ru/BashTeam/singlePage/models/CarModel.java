package ru.BashTeam.singlePage.models;

import jakarta.persistence.*;

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
}
