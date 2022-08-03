package Easy;

import java.util.Arrays;

// n tak ke saare prime numbers print krne hai ya ek n  diya hai or queries array me query puchi hai ki arr[i] prime hai ya nahi
// O(1) me query solve krni hai

public class Prime_Numbers_Sieve_of_Eratosthenes_algo {
 
  
	public static void primes(int n) {
		
		 // 1. ek boolean array bana lo n+1 size ka or true se initailize krdo
		
		boolean isprime[] = new boolean[n+1];
		
		Arrays.fill(isprime, true);
		
		// 2. index 2 se start karo kyuki 0,1 to prime hai hi
		
		// 3. agar indes[i] prime hoga to uski multiples kbhi prime nahi honge
		
		for(int i=2;i*i <= isprime.length;i++) {
			
			
			if(isprime[i]==true) {
				
				for(int j=i+i ;j<isprime.length;j+=i) {
					
					isprime[j] = false;
				}
			}
		}
		
		
		for(int i = 2;i<isprime.length;i++) {
			
			if(isprime[i]==true) {
				
				System.out.print(i+" ");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int n =20;
		
		primes(n);

	}

}
