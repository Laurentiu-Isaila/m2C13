
public class MatrixOp {
	
	
	public static int[][] sum(int[][] m1, int[][] m2){
		int[][] result = new int[m1.length][m1.length];
		
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return result;
	}
 
	public static int[][] diff(int[][] m1, int[][] m2){
		int[][] result = new int[m1.length][m1.length];
		
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				result[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return result;
	}
	
	public static int[][] multS(int[][] m1, int sc){
		int[][] result = new int[m1.length][m1.length];
		
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				result[i][j] = m1[i][j] * sc;
			}
		}
		return result;
	}
	
	public static int[][] multM(int[][] m1, int[][] m2){
		int[][] result = new int[m1.length][m2.length];
		
		for(int i=0;i<m1.length;i++){    
			for(int j=0;j<m2.length;j++){    
			result[i][j]=0;      
				for(int k=0;k<result.length;k++) {      
					result[i][j]+=m1[i][k]*m2[k][j];      
				}
			}
		}
		return result;
	}
	
}
