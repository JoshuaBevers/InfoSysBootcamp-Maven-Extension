package oop.abstraction;

public class car extends vehical {

    protected int doorNumber;


    public car(int ID, String model, int year, String manufacturer, int doorNumber) {
        super(ID, model, year, manufacturer);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return (
                "Model: " +
                        this.model +
                        "\n" +
                        "Year: " +
                        this.year +
                        "\n" +
                        "Manufacturer: " +
                        this.manufacturer +
                        "\n" +
                        "Door Number: " +
                        this.doorNumber +
                        "\n"
        );
    }
}
