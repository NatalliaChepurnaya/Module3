package by.epam.tr.mod3;

import by.epam.tr.mod3.Array;

public class Task1 {
	public static void main(String[] args){
		int mas[];
		int n; // Number of elements
		int k;
		int sum = 0; //Result sum
		
		n = 5;
		k = 2;
		
		mas = Array.createIntArray(n, 100);
		
		for (int i = 0; i < n; i++){
			if (mas[i] % k == 0){
				sum += mas[i]; 
			}
		}
		System.out.println("Result sum of elements - multiples of " + k
				+ ": " + sum);
		
	}	
}
