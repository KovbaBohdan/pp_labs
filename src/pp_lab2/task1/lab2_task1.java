package pp_lab2.task1;
import java.util.Scanner;

public class lab2_task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter name of storage: ");
        String nameOfStorage = console.nextLine();
        System.out.println("Enter number of shells: ");
        int numberOfShells = console.nextInt();
        console.nextLine();

        Storage storage = new Storage(nameOfStorage, numberOfShells);
        Shell[] shells = new Shell[numberOfShells];

        for(int i = 0; i < numberOfShells; i++){
            System.out.println("Enter name of shell: ");
            String nameOfShell = console.nextLine();
            System.out.println("Enter sizes for shell: ");
            double sizeOfShell1 = console.nextDouble();
            double sizeOfShell2 = console.nextDouble();
            double sizeOfShell3 = console.nextDouble();
            console.nextLine();
            shells[i] = new Shell(nameOfShell, sizeOfShell1, sizeOfShell2, sizeOfShell3);
            storage.addShellToStorage(shells[i]);
            System.out.println("Enter number of goods on this shell: ");
            int numberOfGoods = console.nextInt();
            console.nextLine();
            Goods[] goods = new Goods[numberOfGoods];
            for(int j = 0; j < numberOfGoods; j++){
                System.out.println("Enter name of goods on this shell: ");
                String nameOfGoods = console.nextLine();
                System.out.println("Enter sizes for goods on this shell: ");
                double sizeOfGoods = console.nextDouble();
                double sizeOfGoods2 = console.nextDouble();
                double sizeOfGoods3 = console.nextDouble();
                console.nextLine();
                goods[j] = new Goods(nameOfGoods, sizeOfGoods, sizeOfGoods2, sizeOfGoods3);
                shells[i].placeGoodsOnShell(goods[j]);
            }
        }
        storage.printStorage();

//        Goods goods1 = new Goods("Goods1", 5, 15, 20);
//        Goods goods2 = new Goods("Goods2", 5, 10, 20);
//        Goods goods3 = new Goods("Goods3", 5, 15, 15);
//        Goods goods4 = new Goods("Goods4", 5, 15, 30);

        //shell1.placeGoodsOnShell(goods1);
        //shell2.placeGoodsOnShell(goods2);
        //shell1.placeGoodsOnShell(goods3);
        //shell1.placeGoodsOnShell(goods4);

        //shell1.printGoodsOnShell();
        //storage.printStorage();
    }
}
