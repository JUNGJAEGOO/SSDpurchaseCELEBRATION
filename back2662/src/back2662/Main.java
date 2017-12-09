package back2662;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int max = in.nextInt();
		int N = in.nextInt();
		int weight[][] = new int[max][N];
		int value[][] = new int[max][N];
		int dp[][] = new int[max][N];
		
		for ( int i = 0 ; i <= max ; i++ ) {
			for ( int j = 0 ; j <= N ; j++) {
				dp[i][j] = Math.max(dp[i][j], dp[i-weight[i]][j]+value[i]);
			}
		}
	}
}
