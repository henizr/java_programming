package homework_seminar_2;
import java.util.Scanner;
 
public class Task2 {
    public static void main(String[] args) {
        Scanner iscaner = new Scanner(System.in);

        System.out.print("n->");
        int n =  Integer.parseInt(iscaner.nextLine());
        String[] recepts = new String[n];

        for (int i = 0; i < recepts.length; i++) {
            System.out.print("recept->");
            recepts[i] = iscaner.nextLine();
        }

        System.out.print("m->");
        int m =  Integer.parseInt(iscaner.nextLine());
        String[] products = new String[m];

        for (int j = 0; j < products.length; j++) {
            System.out.print("product->");
            products[j] = iscaner.nextLine();
        }
        iscaner.close();

        
        for (int i = 0; i < recepts.length; i++) {
            for (int j = 0; j < products.length; j++) {
                recepts[i] =  recepts[i].replaceAll("(?i)" + products[j].split(" - ")[0], products[j].split(" - ")[1]);
            }
        }

        for (int i = 0; i < recepts.length; i++) {
            System.out.println(recepts[i]);
        }
    }
}
