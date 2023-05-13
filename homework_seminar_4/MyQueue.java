package homework_seminar_4;

public class MyQueue {
    
    private int[] arr = new int[0];  

    public void enqueue(int number){
        int[] newArr = new int[1];
        newArr[0] = number;
        int arrLen = arr.length;
        int newArrLen = newArr.length;
        int totalLength = arrLen + newArrLen;
        int[] resultArray = new int[totalLength];
        
        for (int i = 0; i < arrLen; i++) {
            resultArray[i] = arr[i];
        }

        resultArray[arrLen] = newArr[0];

        arr = resultArray;
    }

    public int dequeue(){
        int[] newArr = new int[arr.length-1];
        int firstElement = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            newArr[i] = arr[i+1];
        }
        arr = newArr;
        return firstElement;
    }

    public int first(){
        return arr[0];
    }

    public void printQueue(){
        if(arr.length!=0){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
