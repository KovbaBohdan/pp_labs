package pp_lab2.task2;

public class Square implements Figures2D {
    private double side;

    public Square(double s){
        this.side = s;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double area(){
        return Math.pow(side, 2);
    }


}
