package homework_seminar_2;


public class Task1 {
    public static void main(String[] args) {
        String s = "cba";
        int[] index = new int[]{3,2,1};

        System.out.println(shuffle(s, index));
    }

    public static String shuffle(final String s, final int[] index){
        char[] s_arr = s.toCharArray();
        for (int i = 0; i < s_arr.length / 2; i++) {
            char bufferStr = s_arr[i];
            s_arr[i] = s_arr[index[i] - 1];
            s_arr[index[i] - 1] = bufferStr;
        }
        return String.valueOf(s_arr);
    }
}
