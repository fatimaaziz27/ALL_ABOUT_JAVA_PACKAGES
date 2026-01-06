package javadev;

public class student {
    String name;
    int age;
    String id;

    public student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }    
}
