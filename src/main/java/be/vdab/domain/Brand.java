package be.vdab.domain;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class Brand {
    private String name;
    private String address;

    public Brand(String name) {
        this.name = name;
    }

    public Brand(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
