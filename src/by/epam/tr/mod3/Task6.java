package by.epam.tr.mod3;

public class Task6 {
	public static void main(String[] args){
		int n = 4; //Array determinant
		int[][] res = new int[n][n];
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1)){
					res[i][j] = 1;
				} else {
					res[i][j] = 0;
				}
				System.out.println(res[i][j]);
				}
			
			}
			
		}
}
