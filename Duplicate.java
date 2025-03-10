import java.util.Arrays;

public class Duplicate {

    static int removerDuplicate(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {

        int[] arr = {10, 11, 12, 13, 14, 15, 16, 17, 18};

        System.out.println("arr[] = " + Arrays.toString(arr));
        int n = arr.length;
        
        n = removerDuplicate(arr, n);

        System.out.println("Array after removing duplicate values : ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

