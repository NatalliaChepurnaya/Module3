package by.epam.tr.mod3;

public class Task3 {
	public static void main(String[] args){
		double[] input = {1, 1.2, 3, 4};
		double x = input[0];
		
		for (int i = 1; i < input.length; i++){
			if (x > input[i]){
				System.out.println("Not increasing set!");
				return;
			} else {
				x = input[i];
			}
		}
		System.out.println("Increasing set!");
		}
}
