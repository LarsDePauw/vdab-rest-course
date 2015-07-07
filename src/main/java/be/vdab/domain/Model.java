package be.vdab.domain;

public class Model {
    private Car car;

    public Model(Car car) {
        this.car = car;
    }

    public Model() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
