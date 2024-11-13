package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        org.example.Person person1 = new Person("Jane", "Doe", 15);
        org.example.Person person2 = new Person("John", "Smith", 25, "New York", "Engineer", 101);

        System.out.println(person1.getFirstName());  // Jane
        System.out.println(person1.getLastName());   // Doe
        System.out.println(person1.getAge());        // 15
        System.out.println(person1.isTeen());        // true

        System.out.println(person2.getFirstName());  // John
        System.out.println(person2.getLastName());   // Smith
        System.out.println(person2.getAge());        // 25
        System.out.println(person2.isTeen());        // false

        org.example.Wall wall = new org.example.Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());


    }
}
