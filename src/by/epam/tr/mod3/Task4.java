package by.epam.tr.mod3;

public class Task4 {
	public static void main(String[] args){
		int[] input = {1, 7, 3, 4};	
		int[] res;
		int len = 0; //Result array length
		int j = 0; //Increment
		
		for (int i = 0; i < input.length; i++ ){
			if (input[i] % 2 == 0){
				len += 1;
			}
		}
		if (len != 0){
			res = new int[len];
			System.out.println("Even elements:");
			for (int i = 0; i < input.length; i++){
				if (input[i] % 2 == 0){
					res[j] = input[i];					
					System.out.println(res[j]);
					j += 1;
				}
			}
		} else {
			System.out.println("No even elements");
		}
}
}
