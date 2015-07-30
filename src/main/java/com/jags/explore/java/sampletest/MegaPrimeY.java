package com.jags.explore.java.sampletest;



//
// TASK
// The task is to find the LARGEST full mega-prime less than one million.
//
// EXPLANATION
// A full mega-prime is prime number that, when you successively remove digits 
// from either its left or right hand sides, you are left with a new prime number; 
// Examples: the number 997 is called a left mega-prime as the 
// numbers 997, 97, and 7 are all prime. 
// The number 7393 is a right mega-prime as the numbers 7393, 739, 73, and 7 formed by removing digits from 
// 7393’s right hand side) are also prime.  
// A 'full' mega-prime is one that is both left mega-prime and right mega-prime
// e.g. 97 is full mega-prime as it's both a left mega-prime and right mega-prime
// No zeroes are allowed in mega-primes.

// 
//

public class MegaPrimeY {
	
	public static void main(String args[])
	{

	    long startTime = System.nanoTime();
        
        int megaPrime = findMegaPrime(1000000);
        
        if(megaPrime != -1)
        {
            System.out.println("Largest mega prime = " + megaPrime);
        }
        else
        {
            System.out.println("Largest mega prime not found");
        }
	    
		long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time : "
                + elapsedTime/1000000);
	}
    
    
    private static int findMegaPrime(int max)
    {
        for(int i = max; i >= 1; i--)
        {
            if(isPrime(i) && isMegaPrime(i))
            {
                return i;
            }
        }
        
        return -1;
    }
    
    
    private static boolean isMegaPrime(int n)
    {
        return isRightPrime(n) && isLeftPrime(n);
    }
    
    private static boolean isRightPrime(int n)
    {
        while(n > 10)
        {
            if(!isPrime(n))
            {
                return false;
            }
            
            n = n / 10;
        }
        
        return isPrime(n);
    }
    
    private static boolean isLeftPrime(int n)
    {
        while(n > 1)
        {
            if(!isPrime(n))
            {
                return false;
            }
            
            n = removeLeftMost(n);
        }
        
        return isPrime(n);
    }
    
    private static int removeLeftMost(int n)
    {
        String s = "" + n;
		
		if(s.length() == 1)
		{
			return Integer.parseInt(s);
		}
		
        return Integer.parseInt(s.substring(1));
    }
	
	public static boolean isPrime(long n) {
		boolean prime = true;
		for (long I = 3; I <= Math.sqrt(n); I += 2)
			if (n % I == 0) {
				prime = false;
				break;
			}
		if ((n % 2 != 0 && prime && n > 2) || n == 2) {
			return true;
		} else {
			return false;
		}
	}
}
