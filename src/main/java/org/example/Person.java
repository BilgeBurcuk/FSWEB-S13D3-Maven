package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int level;
    boolean gpa;
    String englishLevel;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName,int age, int level, String englishLevel,boolean gpa) {
        this(firstName,lastName,age);
        this.level = level;
        this.englishLevel = englishLevel;
        this.gpa=gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age +
                ", level=" + level + ", gpa=" + gpa + ", englishLevel=" + englishLevel + "]";
    }
}