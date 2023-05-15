package homework_seminar_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        String peoples = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        List<String> arrayPeoples = Arrays.asList(peoples.split(", "));
        List<String> arrayNames = new ArrayList<>();
        
        for (int i = 0; i < arrayPeoples.size(); i++) {
            arrayNames.add(arrayPeoples.get(i).split(" ")[0]); 
        }

        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < arrayNames.size(); i++) {
            int freqNUm = Collections.frequency(arrayNames, arrayNames.get(i));
            String name =  arrayNames.get(i);
        
            map.put(freqNUm, name);
        }
         
        System.out.println(map);
    }
}
