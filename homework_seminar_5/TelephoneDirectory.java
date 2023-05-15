package homework_seminar_5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TelephoneDirectory {
    Map<String, List<String>> directory = new HashMap<>();

    public void add(String name, String number){
        if(directory.get(name) == null)
        {
            List<String> list = new ArrayList<>();
            list.add(number);
            directory.put(name, list);
        }
        else{
            directory.get(name).add(number);
        }
    }

    public void search(String name){
        List<String> list = directory.get(name);
        if(list != null){
            System.out.print(name + " ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(" " + list.get(i) + " ");
            }
        }
        else{
            System.out.println("Такого абонента нет");
        }

    }
    public void printAll(){
        for (Map.Entry<String, List<String>> entry: directory.entrySet()) {
            System.out.print(" " + entry.getKey()+":");
            List<String> list = entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                System.out.print(" " + list.get(i) + "");
            }
        }
    }
}
