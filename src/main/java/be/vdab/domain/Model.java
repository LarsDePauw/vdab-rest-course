package be.vdab.domain;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class Model {
    @ManyToOne
    private Brand brand;
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

