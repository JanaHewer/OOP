package Homework_14_12_23;

public class Circle extends Geometry {
    private static String name = "Circle";
    private static final double PI = Math.PI;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double area =  radius*radius*Math.PI;
        return area;

    }

    @Override
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
