package be.vdab.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Brand brand;
    @OneToMany
    private List<Car> cars;

    public Model(Brand brand) {
        this.brand = brand;
    }

    public Model() {
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}

