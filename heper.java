static long gcd(long a, long b) {
  // Only Edge Case: a==0 && b==0. 
    if (b == 0) {
        return a;
    }
    // Use the modulo operator for efficiency O(log(min(a,b)))
    return gcd(b, a % b); 
}

static long modPow(long a,long e,long mod){
    long r=1%mod; a%=mod;
    while(e>0){ if((e&1)==1) r=(r*a)%mod; a=(a*a)%mod; e>>=1; }
    // Print ModPower
    // System.out.println("Value after Power: " + r);
    return r;
}

static long modInv(long a,long mod){ return modPow(a,mod-2,mod); } // mod must be prime
