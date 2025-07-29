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

// REVERSE int array
static void reverse(int[] a){
    for(int l=0,r=a.length-1;l<r;l++,r--){ int t=a[l]; a[l]=a[r]; a[r]=t; }
}

// REVERSE char array
static void reverse(char[] c){
    for(int l=0,r=c.length-1;l<r;l++,r--){ char t=c[l]; c[l]=c[r]; c[r]=t; }
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
