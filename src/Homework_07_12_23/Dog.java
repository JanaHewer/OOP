package Homework_07_12_23;

public class Dog {
    public static void main(String[] args) {

    }
    String name;
    int size;
    public static int counter;

    public Dog(String name, int size){
        this.name = name;
        this.size = size;
        counter++;
    }
    public void bark(){
        System.out.println(name + " can bark");
    }

    }

