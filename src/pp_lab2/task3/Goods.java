package pp_lab2.task3;

public class Goods{
    private String nameOfGoods;
    private double length;
    private double width;
    private double height;

    public Goods(String name, double s1, double s2, double s3){
        this.nameOfGoods = name;
        this.length = s1;
        this.width = s2;
        this.height = s3;
    }

    public String getNameOfGoods(){
        return this.nameOfGoods;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }
}
