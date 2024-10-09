package pp_lab2.task3;
import java.util.Scanner;

public class lab2_task3 {
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
            try {
                System.out.println("Enter sizes for shell: ");
                double sizeOfShell1 = console.nextDouble();
                double sizeOfShell2 = console.nextDouble();
                double sizeOfShell3 = console.nextDouble();
                console.nextLine();

                shells[i] = new Shell(nameOfShell, sizeOfShell1, sizeOfShell2, sizeOfShell3);
                storage.addShellToStorage(shells[i]);
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            System.out.println("Enter number of goods on this shell: ");
            int numberOfGoods = console.nextInt();
            console.nextLine();
            if(numberOfGoods >= 5){
                throw new ArrayStoreException("There are too many goods on this shell");
            }
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
                try {
                    shells[i].placeGoodsOnShell(goods[j]);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        storage.printStorage();
    }
}
