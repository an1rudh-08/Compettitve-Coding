static long gcd(long a, long b) {
  // Only Edge Case: a==0 && b==0. 
    if (b == 0) {
        return a;
    }
    // Use the modulo operator for efficiency O(log(min(a,b)))
    return gcd(b, a % b); 
}
