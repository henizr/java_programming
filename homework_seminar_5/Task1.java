package homework_seminar_5;



public class Task1 {
    public static void main(String[] args) {
        TelephoneDirectory telDir = new TelephoneDirectory();
        
        telDir.add("Sergey", "+79521234679");
        telDir.add("Sergey", "+79673450987");
        telDir.add("Valya", "+79673415088");
        telDir.add("Kseniya", "+79853415088");
        telDir.search("Sergey");
        System.out.println();
        telDir.printAll();
    }
}
