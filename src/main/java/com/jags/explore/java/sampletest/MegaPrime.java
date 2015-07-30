package com.jags.explore.java.sampletest;

//import com.yell.java.util.Strings;

/*
 * @author : Jagadeesh Kumar
 */

import org.apache.commons.lang3.StringUtils;

public class MegaPrime {

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

	

	public static void main(String args[])
	{

		long startTime = System.nanoTime();
		// your code here
		//
		long megaPrime = 0L; 
		long accountedNumber = 1000000-1;
		while (accountedNumber > 2) {
			if(isPrime(accountedNumber)) {
				if(isRightPrime(accountedNumber) && isLeftPrime(accountedNumber)) {
					System.out.println("Found the number " + accountedNumber);
					megaPrime = accountedNumber;
					break;
				}
			} 
			// decrement by 2 as any number divided by 2 is not a prime number. This will reduce the count of iteration
			accountedNumber = accountedNumber-2;
		}
		
		if (megaPrime != 0) {
			System.out.println("Mega Prime is : " + megaPrime);
		}

//		System.out.println(isRightPrime(739397));
//		System.out.println(isLeftPrime(739397));

		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("Total execution time : "
				+ elapsedTime/1000000);
	}

	
	// sysout can be gotten rid off. Keeping it here to just see the output. Removing shoud reduce the execution duration.

	/*
	 * Recursive function to find if a given number is right prime.
	 */
	private static boolean isRightPrime(long accountedNumber) {
		String numStr = accountedNumber + "";
		System.out.println(numStr);

		if(numStr.length() >= 1 && isPrime(Long.parseLong(numStr))) {
			String nextNum = numStr.substring(0, numStr.length()-1);
			if (StringUtils.isNotEmpty(nextNum)) {
				return isRightPrime(Long.parseLong(nextNum));
			}
			return true;

		} else {
			return false;
		}
	}


	/*
	 * Recursive function to find if a given number is left prime.
	 */
	private static boolean isLeftPrime(long accountedNumber) {
		String numStr = accountedNumber + "";
		System.out.println(numStr);

		if(numStr.length() >= 1 && isPrime(Long.parseLong(numStr))) {
			String nextNum = numStr.substring(1, numStr.length());
			if (StringUtils.isNotEmpty(nextNum)) {
				return isLeftPrime(Long.parseLong(nextNum));
			}
			return true;

		} else {
			return false;
		}
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
