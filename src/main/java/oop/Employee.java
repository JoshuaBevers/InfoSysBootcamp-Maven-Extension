package oop;

public class Employee extends Person {
    protected double annualSalary;
    protected double weeklySalary;

    public Employee(String name, int age, String personalityType, double annualSalary) {
        super(name, age, personalityType);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklySalary() {
        return weeklySalary = annualSalary / 52;
    }
}
