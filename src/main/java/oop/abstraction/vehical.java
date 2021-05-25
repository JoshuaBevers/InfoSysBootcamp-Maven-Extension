package oop.abstraction;

public abstract class vehical {
    protected String model;
    protected int year;
    protected String manufacturer;
    protected int ID;

    public vehical(int ID, String model, int year, String manufacturer) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.ID = ID;
    }

    public String getModel() {
        return model;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
