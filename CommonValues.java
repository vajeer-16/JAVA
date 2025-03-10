import java.util.Arrays;

public class CommonValues {

    static void commonValues(int[] arr1, int[] arr2) {

        for (int k : arr1) {
            
            for (int i : arr2) {

                if (k == i) {

                    System.out.println("Common values : " + k);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {22, 23, 24, 25, 26};
        int[] arr2 = {21, 24, 25, 66, 88};
        System.out.println("arr1[] = " + Arrays.toString(arr1));
        System.out.println("arr2[] = " + Arrays.toString(arr2));

        commonValues(arr1, arr2);
    }
}

