package javaDay07;

public class Rectangle {

    public double width;
    public double lenght;

    public void calculateArea(){
        double area = lenght*width;
        System.out.println("Restangle area: " +area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }

    public void calculatePerimeter(){
        double perimeter = 2*lenght+2*width;
        System.out.println("Restangle perimeter: " +perimeter);
    }
}


/*2. Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.
*/
