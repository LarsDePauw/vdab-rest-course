package be.vdab.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String colour;
    private String brand;
    private String licensePlate;

 //  private Model model;

    public Car(String colour, String brand, Model model, String licenseplate) {
        this.colour = colour;
        this.brand = brand;
  //      this.model = model;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

// //   public Model getModel() {
// //       return model;
//    }

//    public void setModel(Model model) {
//        this.model = model;
//    }

    public String getLicenseplate() {
        return licensePlate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licensePlate = licenseplate;
    }

    public String toString() {
        return "brand: " + brand + ", model: " /*+ model */+ ", colour: " + colour + "\n";
    }

}


