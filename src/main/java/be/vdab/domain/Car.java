package be.vdab.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String colour;
    @ManyToOne
    private Brand brand;
    private String licensePlate;
    @ManyToOne
    private Model model;

    public Car(String colour, Brand brand, Model model, String licenseplate) {
        this.colour = colour;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licenseplate;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getLicenseplate() {
        return licensePlate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licensePlate = licenseplate;
    }

    public String toString() {
        return "brand: " + brand + ", model: " + model + ", colour: " + colour + "\n";
    }

}


