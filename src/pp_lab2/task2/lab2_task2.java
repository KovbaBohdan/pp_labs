package pp_lab2.task2;

import java.util.Scanner;

public class lab2_task2 {
    public static void main(String[] args){
        System.out.println("=================================================");
        System.out.println("SQUARE: ");
        Scanner console = new Scanner(System.in);
        System.out.println("Input side of square: ");
        double side = console.nextDouble();
        Square square = new Square(side);
        System.out.println(square.area());
        System.out.println("=================================================");

        System.out.println("=================================================");
        System.out.println("CUBE: ");
        Cube cube = new Cube(3);
        System.out.println(cube.area());
        System.out.println(cube.volume());
        System.out.println("=================================================");

        System.out.println("=================================================");
        System.out.println("RECTANGLE: ");
        Rectangle rectangle = new Rectangle(10, 12);
        System.out.println(rectangle.area());
        System.out.println("=================================================");

        System.out.println("=================================================");
        System.out.println("TRIANGLE: ");
        Triangle triangle = new Triangle(4);
        System.out.println(triangle.area());
        System.out.println("=================================================");

        System.out.println("=================================================");
        System.out.println("PYRAMID: ");
        Piramid piramid = new Piramid(4, 6);
        System.out.println(piramid.area());
        System.out.println(piramid.volume());
        System.out.println("=================================================");

        System.out.println("=================================================");
        System.out.println("CIRCLE: ");
        Circle circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println("=================================================");


        System.out.println("=================================================");
        System.out.println("SPHERE: ");
        Sphere sphere = new Sphere(5);
        System.out.println(sphere.area());
        System.out.println(sphere.volume());
        System.out.println("=================================================");
    }
}
