package org.example;

public class Lesson1 {
    int i = 2;

public void method1 (){
    System.out.println(i);
}

public void method2 (){
    System.out.println(i+1);
}

public void method3 (){
    System.out.println(i+2);
}

public static void main (String [] args){
    Lesson1 obj1 = new Lesson1();
    obj1.method1();
    obj1.method2();
    obj1.method3();
    }

}
