package pp_lab2.task1;

import java.util.ArrayList;
import java.util.List;

public class Shell {
    private double size1;
    private double size2;
    private double size3;
    private String name;
    private int countOfGoodsInShell;
    private List<Goods> allGoods = new ArrayList<Goods>();

    public Shell(String name, double s1, double s2, double s3){
        this.name = name;
        this.size1 = s1;
        this.size2 = s2;
        this.size3 = s3;
        this.countOfGoodsInShell = 0;
    }

    public int getCountOfGoodsInShell(){
        return countOfGoodsInShell;
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

    public String getName(){
        return name;
    }

    public void placeGoodsOnShell(Goods goods){
        if(size1 < goods.getSizeG1() || size2 < goods.getSizeG2() || size3 < goods.getSizeG3()){
            System.out.println("We can`t place your goods in shell. It is too big");
        }
        else{
            allGoods.add(goods);
            countOfGoodsInShell++;
            System.out.println(goods.getNameOfGoods() + " is in shell now");
        }
    }

    public void printGoodsOnShell(){
        System.out.println("================================");
        System.out.println("Information about goods on shell");
        for(int i = 0; i < allGoods.size(); i++){
            System.out.println(allGoods.get(i).getNameOfGoods());
        }
        System.out.println("================================");
    }


}
