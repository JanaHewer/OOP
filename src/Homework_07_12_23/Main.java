package Homework_07_12_23;

public class Main {

    /*
Задача 1

Создать класс Dog c полями name , counter и конструктором.
Cоздать несколько обьектов этого класса и вывести на печать
количество созданных обьектов.

     */
    public static void main(String[] args) {
        Dog dog1 = new Dog("Freddy",15);


        Dog dog2 = new Dog("George",32);

        System.out.println("The number of dogs is " + Dog.counter);

        dog1.bark();
        dog2.bark();

    }
}
