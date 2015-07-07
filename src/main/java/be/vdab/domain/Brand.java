package be.vdab.domain;

import java.util.List;

public class Brand {
    private List<Model> models;

    public Brand() {
    }

    public Brand(List<Model> models) {
        this.models = models;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}
