package homework_seminar_1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner iscaner = new Scanner(System.in);

         while(true){
            System.out.print("Введите первое число->");
            float a = Float.parseFloat(iscaner.nextLine());
            System.out.print("Введите второе число->");
            float b = Float.parseFloat(iscaner.nextLine()); 
            System.out.print("Введите знак(+-*/)->");
            String c = iscaner.nextLine(); 
             
            switch(c){
                case "+":
                System.out.print("Ответ->");
                System.out.print(a+b);
                break;
                case "-":
                System.out.print("Ответ->");
                System.out.print(a-b);
                break;
                case "*":
                System.out.print("Ответ->");
                System.out.print(a*b);
                break;
                case "/":
                System.out.print("Ответ->");
                System.out.print(a/b);
                break;
        }
        System.out.println();
    }
    
    }
}
