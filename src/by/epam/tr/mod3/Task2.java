package by.epam.tr.mod3;

public class Task2 {
	public static void main(String[] args){
		Integer[] input = new Integer[args.length];
		int[] res;
		int len = 0; //Result array length
		int j = 0; //Increment
		
		for (int i = 0; i < args.length; i++ ){
			input[i] = Integer.valueOf(args[i]);
			System.out.println(input[i]);
			if (input[i] == 0){
				len += 1;
			}
		}
		if (len != 0){
			res = new int[len];
			System.out.println("\nZero elements indexes:");
			for (int i = 0; i < input.length; i++){
				if (input[i] == 0){
					res[j] = i;					
					System.out.println(res[j]);
					j += 1;
				}
			}
		} else {
			System.out.println("\nNo zero elements");
		}
		
	}
	

}
