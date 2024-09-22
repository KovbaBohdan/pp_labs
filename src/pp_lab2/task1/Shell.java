package pp_lab2.task1;

import java.util.ArrayList;
import java.util.List;

public class Shell {
    private double size1;
    private double size2;
    private double size3;
    private static List<Goods> allGoods = new ArrayList<Goods>();

    public Shell(double s1, double s2, double s3){
        this.size1 = s1;
        this.size2 = s2;
        this.size3 = s3;
    }

    public double getSize1(){
        return size1;
    }

    public double getSize2(){
        return size2;
    }

    public double getSize3(){
        return size3;
    }

    public void placeGoodsOnShell(Goods goods){
        if(size1 < goods.getSizeG1() || size2 < goods.getSizeG2() || size3 < goods.getSizeG3()){
            System.out.println("We can`t place your goods in shell. It is too big");
        }
        else{
            allGoods.add(goods);
        }
    }


}
