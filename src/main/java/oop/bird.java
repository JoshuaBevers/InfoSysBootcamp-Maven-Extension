package oop;

public class bird {

    protected String species;
    protected boolean bloodlust;
    protected int age;
    protected boolean flight;
    protected String markings;
    protected int numbEyes;
    protected boolean isFlying;
    protected int hungerLevel;

    public bird(
            String species,
            boolean bloodlust,
            int age,
            boolean flight,
            String markings,
            int numbEyes,
            int hungerLevel
    ) {
        this.numbEyes = 200;
        this.markings = "Black";
        this.flight = true;
        this.bloodlust = true;
        this.species = "????";
    }

    public void eat(int food) {
        this.hungerLevel += food;
    }

    public void takeOff() {
        this.isFlying = true;
        decrimentHunger();
    }

    public void land() {
        this.isFlying = false;
        decrimentHunger();
    }

    public void speak(String msg) {
        System.out.println("Tweet.");
        System.out.println("Translation: " + msg);
    }


    //private functions, following dry principles.
    private void decrimentHunger() {
        this.hungerLevel--;
    }
}
