package pp_lab2.task3;

import java.util.ArrayList;
import java.util.List;

public class Shell {
    private double size1;
    private double size2;
    private double size3;
    private String name;
    private List<Good> allGoods = new ArrayList<>();

    public Shell(String name, double s1, double s2, double s3) {
        this.name = name;
        this.size1 = s1;
        this.size2 = s2;
        this.size3 = s3;
    }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public double getSize3() {
        return size3;
    }

    public String getName() {
        return name;
    }

    public void placeGoodsOnShell(Good goods, boolean isShellEnoughBig) {

        if (size1 < goods.getLength() || size2 < goods.getWidth() || size3 < goods.getHeight()) {
            throw new IllegalArgumentException("The goods are too large for this shell: " + goods.getNameOfGood());
        } else if(isShellEnoughBig) {
            allGoods.add(goods);
            System.out.println(goods.getNameOfGood() + " is in shell now");
        } else {
            System.out.println("The shell is too small for this goods: " + goods.getNameOfGood());
        }
    }

    public boolean isVolumeOfShellIsEnoughForAllGoods(Good[] goods){
        double shellVolume = size1 * size2 * size3;
        double volumeOfAllGoods = 0;
        for(int i = 0; i < goods.length; i++){
            volumeOfAllGoods += goods[i].getLength() * goods[i].getWidth() * goods[i].getHeight();
        }
        if(shellVolume >= volumeOfAllGoods){
            return true;
        } else {
            return false;
        }
    }

    public void printGoodsOnShell() {
        System.out.println("================================");
        System.out.println("Information about goods on shell");
        for (int i = 0; i < allGoods.size(); i++) {
            System.out.println(allGoods.get(i).getNameOfGood());
        }
        System.out.println("================================");
    }
}
