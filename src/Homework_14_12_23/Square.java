package Homework_14_12_23;

public class Square extends Geometry{
    private static String name = "Square";
    private double length;

    public Square(double length){
        this.length = length;

    }

    @Override
    public double getArea() {
        return length*length;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }
}
