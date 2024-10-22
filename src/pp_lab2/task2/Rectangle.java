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
}
