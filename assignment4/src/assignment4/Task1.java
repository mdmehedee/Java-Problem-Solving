package assignment4;

public class Task1{
	//Method required
	public static int productDiagonals(int array[][], int N) {
		int leftDiagonal=1, rightDiagonal=1, totalproduct;
		
		for(int row =0 ; row < N; ++row) {
			rightDiagonal=rightDiagonal*array[row][N-row-1];
			
			 for(int column =0; column<array[row].length;++column) 
			 {
				 
				 if(row == column) 
				 {
					 leftDiagonal=leftDiagonal*array[row][column];
				 }
				 
			 }
		}
		
		  if(N%2!=0) 
		      {
		    	  int var = N/2;
		    	  int mid = array[var][var];
		    	  totalproduct = (leftDiagonal*rightDiagonal)/mid;
		      }
		      
		  else{
		    	  totalproduct = leftDiagonal*rightDiagonal;
		      }
		return totalproduct;
	}
}