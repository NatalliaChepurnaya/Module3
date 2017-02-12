package by.epam.tr.mod3;

public class Task5 {
	public static void main(String[] args){
		int n = 4; //Array determinant
		int[][] res = new int[n][n];
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				res[i][j] = (int)Math.pow(n, i % 2) + j * (int)Math.pow(-1, i % 2);
				System.out.println(res[i][j]);
				}
			
			}
			
		}
}
