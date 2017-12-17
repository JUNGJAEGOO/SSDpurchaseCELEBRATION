package back5557;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static long dp[][] = new long[21][101];
	static int arr[];
	static int N;
	static int dest;
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		arr = new int[N];
		N--;
		for ( int i = 0 ; i < N ; i++) {
			arr[i] = in.nextInt();
		}
		dest = in.nextInt();
		for ( int i = 0 ; i < 21 ; i++) {
			for ( int j = 0 ; j < 101 ; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(DFS(arr[0],0));
	
	}
	
	public static long DFS(int sum,int visit) {
		if ( sum > 20 || sum < 0) {
			return 0;
		}
		if ( visit == N-1) {
			if ( sum == dest ) {
				dp[sum][visit] = 1;
			}else {
				dp[sum][visit] = 0;
			}
			return dp[sum][visit];
		}
		
		long ret = dp[sum][visit];
		if ( ret != -1) { return ret;}
		ret = 0;
		
		ret += DFS(sum+arr[visit+1],visit+1);
		ret += DFS(sum-arr[visit+1],visit+1);
		
		return dp[sum][visit] = ret;
	}
}
