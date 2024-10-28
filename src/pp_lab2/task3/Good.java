package pp_lab2.task3;

public class Good {
    private String nameOfGood;
    private double length;
    private double width;
    private double height;

    public Good(String name, double s1, double s2, double s3){
        this.nameOfGood = name;
        this.length = s1;
        this.width = s2;
        this.height = s3;
    }

    public String getNameOfGood(){
        return this.nameOfGood;
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
