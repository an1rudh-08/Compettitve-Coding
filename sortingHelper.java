// SORTING int[]
public static void sortAsc(int[] arr) {
    Arrays.sort(arr);
    // Printing Array;
    //System.out.println(Arrays.toString(arr));        
}

public static void sortDes(int[] arr) {
    Arrays.sort(arr);
    for (int l = 0, r = arr.length - 1; l < r; l++, r--) {
        int t = arr[l]; arr[l] = arr[r]; arr[r] = t;
    }
    // Printing Array;
    //System.out.println(Arrays.toString(arr));
}
