package pp_lab2.task3;

public class Goods{
    private String nameOfGoods;
    private double sizeG1;
    private double sizeG2;
    private double sizeG3;

    public Goods(String name, double s1, double s2, double s3){
        this.nameOfGoods = name;
        this.sizeG1 = s1;
        this.sizeG2 = s2;
        this.sizeG3 = s3;
    }

    public String getNameOfGoods(){
        return this.nameOfGoods;
    }

    public double getSizeG1(){
        return this.sizeG1;
    }

    public double getSizeG2(){
        return this.sizeG2;
    }

    public double getSizeG3(){
        return this.sizeG3;
    }



}
