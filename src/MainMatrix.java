
public class MainMatrix {

	public static void main(String[] args) {
		
		int[][] a={{1,1,1},{2,2,2},{3,3,3}};    
		int[][] b={{1,1,1},{2,2,2},{3,3,3}};  
		
		int[][] c = MatrixOp.multM(a, b);
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(" ");
			for(int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
		}


	}

}
