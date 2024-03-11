package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        Person person1 = new Person("John", "Doe", 25);
        Person person2 = new Person("Jane", "Doe", 15, 3, "Advanced", true);

        System.out.println(person1);        System.out.println(person2);
        System.out.println("Firstname: " + person1.getFirstName());

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

    }
}