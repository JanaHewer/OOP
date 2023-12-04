package Homework_04_12_23;
/*
Задача 2
Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
конструктор и методы для подсчета площади и периметра прямоугольника. В классе
Main создать несколько обьектов класса Rectangle и вывести на экран площадь и
периметр каждого
 */

public class Rectangle {
   public double height;
   public double width;

   public Rectangle(double height, double width ){
      this.height = height;
      this.width = width;
   }
public double countPerimeter(){
      double perimeter = height*2 + width*2;
      return perimeter;
}

public double countArea (){
      double area = height*width;
      return area;
}
}
