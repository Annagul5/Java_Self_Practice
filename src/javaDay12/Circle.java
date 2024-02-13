package javaDay12;

public class Circle {
    private double radius;

    public void setRadius(double radius) {

        if(radius<=0){
            System.err.println("The radius cannot be set to a negative or zero value.");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double getRadius() {

        if(radius<=0){
            System.err.println("The radius cannot be set to a negative or zero value.");
            System.exit(1);
        }
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return radius*radius*Math.PI;
    }
    public double calcPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}


















