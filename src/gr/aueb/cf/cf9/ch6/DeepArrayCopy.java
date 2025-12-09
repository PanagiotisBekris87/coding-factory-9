package gr.aueb.cf.cf9.ch6;

/**
 * Defensive, fresh, deep copy
 */
public class DeepArrayCopy {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arrCopy;
        arrCopy = getArrayDeepCopy(arr);

        arrCopy[0] = 1000;
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arrCopy[0] = " + arrCopy[0]);
    }

    public static int[] getArrayDeepCopy(int[] arr) {

        int[] destinationArr = new int[arr.length];

        for (int i = 0; i <arr.length; i++) {
            destinationArr[i]  = arr[i];
        }

        return destinationArr;
    }



}
