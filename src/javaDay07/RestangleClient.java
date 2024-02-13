package javaDay07;

public class RestangleClient {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width=12;
        rectangle.lenght=23;

        System.out.println("Width = "+ rectangle.width);
        System.out.println("Lenght = "+ rectangle.lenght);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println(rectangle);

    }


}
