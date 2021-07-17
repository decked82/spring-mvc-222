package web.model;

public class Car {

    private String classification;

    private String model;

    private int yearOfManufacture;

    public Car() {
    }

    public Car(String classification, String model, int yearOfManufacture) {
        this.classification = classification;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
