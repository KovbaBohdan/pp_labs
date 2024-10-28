package pp_lab2.task3;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private String nameOfStorage;
    private static List<Shell> allShells = new ArrayList<>();

    public Storage(String name){
        this.nameOfStorage = name;
    }

    public String getNameOfStorage() {
        return nameOfStorage;
    }

    public void addShellToStorage(Shell shell){
        for(int i = 0; i < allShells.size(); i++){
            if(allShells.get(i).getName().equals(shell.getName())){
                throw new IllegalArgumentException("Shell already exists");
            }
        }
        allShells.add(shell);
    }

    public void printStorage(){
        System.out.println("======================================");
        System.out.println("Name of storage: " + nameOfStorage);
        System.out.println("Number of shells: " + allShells.size());
        System.out.println("======================================");
        for(int i = 0; i < allShells.size(); i++){
            System.out.println("Information about " + allShells.get(i).getName());
            allShells.get(i).printGoodsOnShell();
        }
        System.out.println("======================================");
    }
}
