package pp_lab2.task2;

public class Circle implements Geom_Vigures{
    private double radius;

    public Circle(double rad){
        this.radius = rad;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double area(){
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double volume(){
        System.out.println("Circle is not a 3D figure. There is not volume");
        return 0.0;
    }
}
