package oop.abstraction;

public class plane extends vehical {

    protected boolean canFly;

    public plane(
            int ID,
            String model,
            int year,
            String manufacturer,
            Boolean canFly
    ) {
        super(ID, model, year, manufacturer);
        this.canFly = canFly;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean newStatus) {
        this.canFly = newStatus;
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
                        "Can it fly?: " +
                        this.canFly +
                        "\n"
        );
    }
}
