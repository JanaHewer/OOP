package Homework_05_12_23;

public class Main {
    /*
    Задача 1
Создать класс Temperature (температура), содержащий метод для перевода
градусов по фаренгейту в градусы цельсия ( celsius = 5*(farenheit - 32)/9).
В классе Main создать несколько обьектов класса Temperature
(значение температуры по фаренгейту должно задаваться через конструктор)
и вывести результат перевода на экран
     */


    public static void main(String[] args) {

        Temperature a = new Temperature(0,32);
        Temperature b = new Temperature(0,77);
        a.getCelsius();
        b.getCelsius();
    }
}