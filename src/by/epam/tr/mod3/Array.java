package by.epam.tr.mod3;

public class Array {
	public static void main(String[] args){}
	public static int[] createIntArray(int n, int k){
		int[] mas = new int[n];
		
		for (int i = 0; i < n; i++){
			mas[i] = (int) (Math.random() * k); 
			System.out.println(mas[i]);
		}
		return mas;
	}

}
