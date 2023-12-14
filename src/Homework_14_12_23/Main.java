package Homework_14_12_23;

public class Main {

     /*
    Геометрические фигуры
    Используя свойства наследования написать программу для подсчета площади
    трех видов фигур - круга, прямоугольника и квадрата.
    Создать классы Circle, Rectangle, Square , содержащие соответствующие методы.
    Затем в методе main создать маcсив из нескольких фигур и вывести на печать площади каждой фигуры и название ее
    примерно в таком виде :
    Circle has area of 100.0
    Rectangle has area of 400.0
    Square has area of 340.0

     */
     public static void main(String[] args) {
         Geometry[] figure = {new Rectangle(8,12),
         new Circle(10), new Square(25)};

         for (Geometry fig : figure)
             System.out.println(fig.getName() + " has area of " + fig.getArea());
     }
}
