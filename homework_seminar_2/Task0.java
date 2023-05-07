package homework_seminar_2;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        //aB
        //aaaAbbbB
        //a3B1
        Scanner iscaner = new Scanner(System.in);
        
        System.out.print("jewels->");
        String jewels = iscaner.nextLine();
        System.out.print("stones->");
        String stones = iscaner.nextLine();
        iscaner.close();

        System.out.println(findJewelsInStones(jewels, stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        int jewelsCounter = 0;
        char[] jewelsArr = jewels.toCharArray();
        char[] stonesArr = stones.toCharArray();
        String result = "";
        for (int i = 0; i < jewelsArr.length; i++) {
            for (int j = 0; j < stonesArr.length; j++) {
                if(jewelsArr[i] == stonesArr[j]){
                    jewelsCounter ++;
                }
            }
            result = result + jewelsArr[i] + jewelsCounter;
            jewelsCounter = 0;
        }
        return result;
    }
}
