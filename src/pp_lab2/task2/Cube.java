package pp_lab2.task2;

public class Cube extends Square{
    public Cube(double s){
        super(s);
    }

    @Override
    public double area(){
        return 6 * super.area();
    }

    @Override
    public double volume(){
        return Math.pow(super.getSide(), 3);
    }
}
