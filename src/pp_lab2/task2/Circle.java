package pp_lab2.task2;

public class Circle implements Figures2D, Constant {
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
}
