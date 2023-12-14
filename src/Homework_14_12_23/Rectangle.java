package Homework_14_12_23;

public class Rectangle extends Geometry {
    private static String name = "Rectangle";
    private double length, width;
    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;

    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
   public void setWidth(double width){
        this.width = width;
   }

    }

