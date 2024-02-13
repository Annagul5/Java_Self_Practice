package javaDay12;

public class Restangle {
     public double width,length;

    public double getWidth() {
        if(width<=0){

            System.err.println("The width and length cannot be set to negative or zero values.");
            System.exit(1);
        }
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){

            System.err.println("The width and length cannot be set to negative or zero values.");
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        if(length<=0){

            System.err.println("The width and length cannot be set to negative or zero values.");
            System.exit(1);
        }
        return length;
    }

    public void setLength(double length) {
        if(length<=0){

            System.err.println("The width and length cannot be set to negative or zero values.");
            System.exit(1);
        }
        this.length = length;
    }

    public Restangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double calcArea(){
        return length*width;
    }
    public double calcPerimeter(){
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return "Restangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
