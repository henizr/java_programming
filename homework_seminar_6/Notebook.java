package homework_seminar_6;

public class Notebook {
    private String name;
    private int ram;
    private int hddMenory;
    private String operationSystem;
    private String color;

    public Notebook(String name, int ram, int hddMenory, String operationSystem, String color){
        this.name = name;
        this.ram = ram;
        this.hddMenory = hddMenory;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public String getName(){
        return this.name;
    }
    public  int getRam(){
        return this.ram;
    }
    public int getHddMemory(){
        return this.hddMenory;
    }
    public String getOperationSystem(){
        return this.operationSystem;
    }
    public String getColor(){
        return this.color;
    }
}
