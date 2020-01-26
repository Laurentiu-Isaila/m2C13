import java.util.Scanner;
public class Matrix {

	static Scanner sc = new Scanner(System.in);
		
	
	 
	
	 
	 
	 int upValue;
	 int rightValue;
	 int bottomValue;
	 
	
	public static int[][] generate(){
		System.out.println("Enter matrix dimension: ");
		int matrixDimension = sc.nextInt();
		int[][] matrix = new int[matrixDimension][matrixDimension];
		
		System.out.println("Enter main diagonal value: ");
		int mainDiagValue = sc.nextInt();
		for(int i = 0; i < matrixDimension; i++) {
			matrix[i][i] = mainDiagValue;			
		}
		
		System.out.println("Enter second diagonal value: ");
		int sndDiagValue = sc.nextInt();
		for(int i = matrixDimension - 1; i >= 0 ; i--) {
			matrix[i][matrixDimension - i - 1] = sndDiagValue;			
		}
		
		if(matrixDimension % 2 != 0) {
			System.out.println("Enter central element value: ");
			int centerValue = sc.nextInt();
			matrix[matrixDimension/2][matrixDimension/2] = centerValue;
		}
		
		System.out.println("Enter left value: ");
		int leftValue = sc.nextInt();
		for(int i = 1; i < matrixDimension /2; i++) {
			for(int j = 0; j < i  ; j++) {
				matrix[i][j] = leftValue;
			}
		}
		
		for(int i = matrixDimension / 2  ; i < matrixDimension ; i++) {
			for(int j = 0; j < matrixDimension -1 - i   ; j++) {
				matrix[i][j] = leftValue;
			}
		}
		
		return matrix;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
