package homework_seminar_1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner iscaner = new Scanner(System.in);
        System.out.print("h->");
        int h = Integer.parseInt(iscaner.nextLine());
        

        int[] elements = new int[h];
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            System.out.print("item->");
            int item = Integer.parseInt(iscaner.nextLine());
            elements[i] = item;
            if(i %2 == 0){
                sum += item;
            }
        }
        iscaner.close();
        
        System.out.println(sum); 
        
        for (int i = 0; i < elements.length; i++) {
            if(i %2 == 0){
                System.out.println(elements[i]);
            }
        }

        
    }
}
