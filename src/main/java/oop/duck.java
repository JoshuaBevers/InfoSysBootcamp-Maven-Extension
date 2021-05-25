package oop;

public class duck extends bird {

    protected boolean isSwimming;
    protected boolean canSwimm;

    public duck(
            String species,
            boolean bloodlust,
            int age,
            boolean flight,
            String markings,
            int numbEyes,
            int hungerLevel
    ) {
        super(species, bloodlust, age, flight, markings, numbEyes, hungerLevel);
    }

    public void speak() {
        System.out.println("quack quack, mother------.");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    public boolean isCanSwimm() {
        return canSwimm;
    }

    public void setCanSwimm(boolean canSwimm) {
        this.canSwimm = canSwimm;
    }
}
