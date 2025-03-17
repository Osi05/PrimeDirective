package com.bptn.primeDirective;

import java.util.ArrayList;

public class PrimeDirective {
	
	//creating method for isPrime
	
	public boolean isPrime(int number) {
		
		//checking for numbers that's equals or less than 2
		
		if (number == 2) {
			return true;
		}
		else if (number < 2) {
			return false;
		}
		
		
		for (int i = 2; i < number; i++) {
			
			if (number % i == 0) {
				
				return false;
			}
		}
		return true;
	}
	
	//creating onlyPrime method
	
	public ArrayList<Integer> onlyPrimes(int[] numbers){
		
		//creating empty ArrayList
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		//using forEach to access the ArrayList
		for (int number : numbers) {
			
			
			if(isPrime(number)) {
				primes.add(number);
			}
		}
		
		return primes;
		
	}
	
	
	public static void main(String[] args) {
		
		PrimeDirective numTest = new PrimeDirective();
		
		int[] nums = {6, 29, 28, 33, 11, 100, 101, 43, 89};
		
		System.out.println(numTest.onlyPrimes(nums)); 
		
	}

}
