package pp_lab2.task2;

public class Rectangle extends Square{
    private double side2;

    public Rectangle(double s, double s2){
        super(s);
        this.side2 = s2;
    }

    @Override
    public double area(){
        return side2 * super.getSide();
    }

    @Override
    public double volume(){
        System.out.println("Rectangle is not a 3D figure. There is not volume");
        return 0.0;
    }
}
