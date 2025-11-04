package org.example;

public class App {
    byte b = 10;
    short sh = 11;
    int i = 111;
    long l = 1_000;
    double d = 1.8;
    float f = 1.1F;
    char c = 'a';
    boolean flag = true;

    public static void main( String[] args ) {
        User user = new User();
        user.name = "Jim";
        user.age = 18;
        user.sayHi();
    }
}

class User {
    String name;
    int age;

    public void sayHi() {
        System.out.println("Hi!");
    }

}