
public class Goose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =0;
		int l =0;
		int[] arr = new int[n];
		int[][] opt = new int[n][l+1];

		for (int i=0; i<n; i++) {
			for (int j=0; j<=l; j++) {
				if(i == 0) {
					if(j < arr[0]) {
						opt[0][j] = 0;
					}
					else {
						opt[0][j] = arr[0];
					}
				}
				else {
					if(j < arr[i]) {
						opt[i][j] = opt[i-1][j];
					}
					else {
						opt[i][j] = max(opt[i-1][j], opt[i-1][j-arr[i]] + arr[i]);
					}
				}
			}
		}
		
		System.out.println(opt[n-1][l]);
	}
	
	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}

}
