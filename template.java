import java.util.*;
import java.lang.*;
import java.io.*;

// FastReader class for efficient input
class FastReader {

    // BufferedReader to read input
    BufferedReader b;

    // StringTokenizer to tokenize input
    StringTokenizer s; 

    // Constructor to initialize BufferedReader
    public FastReader() {
        b = new BufferedReader
          (new InputStreamReader(System.in));
    }

    // Method to read the next token as a string
    String next() {
        while (s == null || !s.hasMoreElements()) {
            try {
                s = new StringTokenizer(b.readLine());
            } catch (IOException e) {
                e.printStackTrace(); 
            }
        }
        return s.nextToken();
    }

    // Method to read the next token as an integer
    int nextInt() { 
        return Integer.parseInt(next()); 
    }

    // Method to read the next token as a long
    long nextLong() { 
        return Long.parseLong(next()); 
    }

    // Method to read the next token as a double
    double nextDouble() { 
        return Double.parseDouble(next()); 
    }

    // Method to read the next line as a string
    String nextLine() {
        String str = "";
        try {
            if (s.hasMoreTokens()) {
                str = s.nextToken("\n");
            } else {
                str = b.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        return str;
    }
}



// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // Create a FastReader instance for input
        FastReader s = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        
        int tt = s.nextInt(); 
        for(int t=0;t<tt;t++){
            System.out.println("HI"); 
            
        }
        
        out.close();
    }
}
