package pp_lab2.task2;

public class Sphere extends Circle implements Figures3D {
    public Sphere(double rad){
        super(rad);
    }

    @Override
    public double area(){
        return 4 * PI * Math.pow(super.getRadius(), 2);
    }

    @Override
    public double volume(){
        return 4. / 3 * PI * Math.pow(super.getRadius(), 3);
    }
}
