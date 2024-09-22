package pp_lab2.task2;

import static java.lang.Math.sqrt;

public class Piramid extends Triangle{
    private double rebro1;

    public Piramid(double s1, double r1){
        super(s1);
        this.rebro1 = r1;
    }

    public double area(double s1, double s2, double s3){
        double halfOfPerimeter = (s1 + s2 + s3) / 2;
        return sqrt(halfOfPerimeter * (halfOfPerimeter - s1) * (halfOfPerimeter - s2) * (halfOfPerimeter - s3));
    }

    @Override
    public double area(){
        return super.area() + 3 * area(rebro1, rebro1, super.getSide());
    }

    @Override
    public double volume(){
        double r = super.getSide() * sqrt(3) / 3;
        double h = sqrt(Math.pow(rebro1, 2) - Math.pow(r, 2));
        return super.area() * h / 3;
    }


}
