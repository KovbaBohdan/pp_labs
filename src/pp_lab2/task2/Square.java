package pp_lab2.task2;

public class Square implements Geom_Vigures {
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

    @Override
    public double volume(){
        System.out.println("Square is not a 3D figure. There is not volume");
        return 0.0;
    }

}
