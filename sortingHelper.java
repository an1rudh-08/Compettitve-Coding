// SORTING int[]
public static void sortA(int[] arr) {
    Arrays.sort(arr);
    // Printing Array;
    //System.out.println(Arrays.toString(arr));        
}

public static void sortD(int[] arr) {
    Arrays.sort(arr);
    for (int l = 0, r = arr.length - 1; l < r; l++, r--) {
        int t = arr[l]; arr[l] = arr[r]; arr[r] = t;
    }
    // Printing Array;
    //System.out.println(Arrays.toString(arr));
}

// SORTING A String
static String sortD(String str) {
    if (str == null || str.length() <= 1) return str;
    char[] c = str.toCharArray();
    java.util.Arrays.sort(c);
    return new StringBuilder(new String(c)).reverse().toString();
}
static String sortA(String str) {
    if (str == null || str.length() <= 1) return str;
    char[] c = str.toCharArray();
    java.util.Arrays.sort(c);
    return new StringBuilder(new String(c)).toString();
}
