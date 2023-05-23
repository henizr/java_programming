package homework_seminar_6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
public static void main(String[] args) {

    Notebook notebook1 = new Notebook("lenovo", 4000, 100000, "windows", "white");
    Notebook notebook2 = new Notebook("asus", 16000, 200000, "windows", "black");
    Notebook notebook3 = new Notebook("samsung", 8000, 100000, "linux", "pink");
    Notebook notebook4 = new Notebook("hp", 8000, 400000, "windows", "white");
    Notebook notebook5 = new Notebook("lenovo", 4000, 100000, "windows", "white");
    Set<Notebook> notebooks = new HashSet<>();
    notebooks.add(notebook1);
    notebooks.add(notebook2);
    notebooks.add(notebook3);
    notebooks.add(notebook4);
    notebooks.add(notebook5);


    getNotebooks(notebooks);
    
}

public static void getNotebooks(Set<Notebook> notebooks){
    Scanner iscaner = new Scanner(System.in);

    while(true){
        Map<String, Object> criteriasNotebooks = new HashMap<>();

        System.out.print("Введите название ноутбука: ");
        criteriasNotebooks.put("name", iscaner.nextLine());
        System.out.print("Введите ram: ");
        criteriasNotebooks.put("ram", Integer.parseInt(iscaner.nextLine()));
        System.out.print("Введите hdd memory: ");
        criteriasNotebooks.put("hddMemory", Integer.parseInt(iscaner.nextLine()));
        System.out.print("Введите operation system: ");
        criteriasNotebooks.put("operationSystem", iscaner.nextLine());
        System.out.print("Введите color: ");
        criteriasNotebooks.put("color", iscaner.nextLine());

        
        for(Notebook notebook: notebooks){
            if (notebook.getName().equals(criteriasNotebooks.get("name")) && 
                notebook.getRam() == (int)criteriasNotebooks.get("ram") &&
                notebook.getHddMemory() == (int) criteriasNotebooks.get("hddMemory") &&
                notebook.getOperationSystem().equals(criteriasNotebooks.get("operationSystem")) &&
                notebook.getColor().equals(criteriasNotebooks.get("color"))
            ) 
                
                {
                
                    System.out.println("----------------");
                    System.out.println("Название ноутбука: " + notebook.getName());
                    System.out.println("Оперативая память: " + notebook.getRam());
                    System.out.println("Жесткий диск: " + notebook.getHddMemory());
                    System.out.println("Операционная система: " + notebook.getOperationSystem());
                    System.out.println("Цвет: " + notebook.getColor());
                    System.out.println("----------------");
            }
        }

        System.out.println();
        System.out.print("Для выхода нажмите 0 или enter для продолжения: ");
        int input = Integer.parseInt(iscaner.nextLine());

        if(input == 0){
            break;
        }

    }
    iscaner.close();
}
    
}