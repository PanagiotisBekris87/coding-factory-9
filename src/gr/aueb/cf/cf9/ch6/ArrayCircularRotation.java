package gr.aueb.cf.cf9.ch6;

/**
 * Circular rotation
 */
public class ArrayCircularRotation {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = shiftRightBy(arr1,1);
        int[] arr3 = shiftRightBy(arr1,2);
        int[] arr4 = shiftLeftBy(arr3,3);



        System.out.print("arr1: ");
        printArray(arr1);
        System.out.print("arr2: ");
        printArray(arr2);
        System.out.print("arr3: ");
        printArray(arr3);
        System.out.print("arr4: ");
        printArray(arr4);


    }

    public static int[] shiftRightBy(int[] arr, int offset) {

        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int rotated[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }


    public static int[] shiftLeftBy(int[] arr, int offset) {

        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];

        int rotated[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }


    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
