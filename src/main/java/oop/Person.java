package oop;

public class Person {
    protected int age;
    protected String personalityType;
    protected String name;

    public Person(String name, int age, String personalityType) {
        this.name = name;
        this.age = age;
        this.personalityType = personalityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonalityType() {
        return personalityType;
    }

    public void setPersonalityType(String personalityType) {
        this.personalityType = personalityType;
    }

}
