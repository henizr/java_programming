package homework_seminar_3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        
        ArrayList<String> planets = new ArrayList<>();
        ArrayList<String> planetsWithoutRepeatins = new ArrayList<>();

        planets.add("Moon");
        planets.add("Mercury");
        planets.add("Jupiter");
        planets.add("Sun");
        planets.add("Mars");
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Moon");
        planets.add("Sun");
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Neptune");
        planets.add("Mars");
        planets.add("Mercury");



        for (int i = 0; i < planets.size(); i++) {
            if(!planetsWithoutRepeatins.contains(planets.get(i))){
                planetsWithoutRepeatins.add(planets.get(i));
            }
        }

        int counter = 0;

        for (int i = 0; i < planetsWithoutRepeatins.size(); i++) {
            for (int j = 0; j < planets.size(); j++) {
                if(planetsWithoutRepeatins.get(i) == planets.get(j)){
                    counter++;
                }
            }
            System.out.println(planetsWithoutRepeatins.get(i) + " count: " + counter);
            counter = 0;
        }
    }
}
