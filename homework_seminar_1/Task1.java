package homework_seminar_1;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i <=1000; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return num != 1;
    } 
}
