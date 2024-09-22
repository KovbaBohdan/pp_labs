package pp_lab2.task2;

import static java.lang.Math.sqrt;

public class Triangle implements Geom_Vigures{
    private double side;

    public double getSide(){
        return side;
    }

    public Triangle(double s1){
        this.side = s1;
    }

    @Override
    public double area(){
        return Math.pow(side, 2) * sqrt(3) / 4;
    }

    @Override
    public double volume(){
        System.out.println("Triangle is not a 3D figure. There is not volume");
        return 0.0;
    }
}
