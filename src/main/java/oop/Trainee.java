package oop;

import java.util.List;

public class Trainee extends Person {
    protected double bursary;
    protected List<String> subjectsLearned;

    public Trainee(String name, int age, String personalityType, double bursary, List<String> subjectsLearned) {
        super(name, age, personalityType);
        this.bursary = bursary;
        this.subjectsLearned = subjectsLearned;
    }

    public double getBursary() {
        return bursary;
    }

    public void setBursary(double bursary) {
        this.bursary = bursary;
    }

    public List<String> getSubjectsLearned() {
        return subjectsLearned;
    }

    public void addSubjectsLearned(String subjectsLearned) {
        this.subjectsLearned.add(subjectsLearned);
    }

}
