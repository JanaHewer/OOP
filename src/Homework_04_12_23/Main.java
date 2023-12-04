package Homework_04_12_23;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", 23);

        System.out.println("Name of Student: " + student1.name);
        System.out.println(" Age of Student: " + student1.age);

        Student student2 = new Student("Sam", 19);
        System.out.println();
        System.out.println("Name of Student: " + student2.name);
        System.out.println(" Age of Student: " + student2.age);

        System.out.println("Задача 2");

        Rectangle rectangle1 = new Rectangle(12, 45);
        Rectangle rectangle2 = new Rectangle(13.5, 30);

        System.out.println("The perimeter of a rectangle one = " + rectangle1.countPerimeter());
        System.out.println("Area of a rectangle one = " + rectangle1.countArea());


        System.out.println("The perimeter of a rectangle two = " + rectangle2.countPerimeter());
        System.out.println("Area of a rectangle one = " + rectangle2.countArea());
    }
}
