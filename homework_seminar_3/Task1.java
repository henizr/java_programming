package homework_seminar_3;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(11);
        array.add(4);
        array.add(310);
        array.add(121);
        array.add(89);
        array.add(80);
        array.add(51);


        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) %2 == 0){
                array.remove(i);
                i--;
            }
        }

        
        System.out.println(array);
        
    }
}
