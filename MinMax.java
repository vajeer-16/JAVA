import java.util.Arrays;

public class MinMax {

    static int minValue(int[] arr) {

        int min = arr[0];

        for (int j : arr)
            if (j < min)
                min = j;
        return min;
    }

    static int maxValue(int[] arr) {

        int max = arr[0];

        for (int j : arr)
            if (j > max)
                max = j;
        return max;
    }

    public static void main(String[] args) {
       
        int[] my_arr = {10, 11, 12, 13, 14, 15};

        System.out.println("my_arr = " + Arrays.toString(my_arr));

        System.out.println("The Maximum value = " + maxValue(my_arr));

        System.out.println("The Minimum value = " + minValue(my_arr));
    }
} 

