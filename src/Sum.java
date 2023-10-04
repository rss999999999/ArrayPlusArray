public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        int sumArr1 = 0;
        int sumArr2 = 0;


        for (int i = 0; i < arr1.length; i++) {
            sumArr1 += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            sumArr2 += arr2[i];
        }


        return sumArr1 + sumArr2;
    }

}