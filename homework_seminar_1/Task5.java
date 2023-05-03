package homework_seminar_1;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner iscaner = new Scanner(System.in);
        System.out.print("len->");
        int len = Integer.parseInt(iscaner.nextLine());

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("a->");
            int a = Integer.parseInt(iscaner.nextLine());
            arr[i] = a;
        }
         
        iscaner.close();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 if(arr[i] == arr[j]){
                    counter ++;
                 }
             }
            if(counter == 1){
                System.out.println(arr[i]);
            }
            counter = 0;
        }
    }
}
